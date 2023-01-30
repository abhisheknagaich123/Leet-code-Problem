public class rob198 {
    public int rob(int[] nums) {
return robfrom(nums,0);
    }

    private int robfrom(int[] wealth, int currentindx) {
        if (currentindx>= wealth.length)
            return 0;
        int chorekaro =wealth[currentindx]+robfrom(wealth,currentindx+2);
        int nochore =robfrom(wealth , currentindx+1);
        return Math.max(chorekaro,nochore);
    }


}
