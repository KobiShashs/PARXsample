package nayax.com.parx;

/**
 * Created by kobishasha on 8/3/16.
 */
public class Info {
    private String mName;
    private String mCarNumber;
    private String mEmail;



    private String mPhone;

    public Info(String mName, String mCarNumber, String mEmail, String mPhone) {
        setmName(mName);
        setmCarNumber(mCarNumber);
        setmEmail(mEmail);
        setmPhone(mPhone);

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCarNumber() {
        return mCarNumber;
    }

    public void setmCarNumber(String mCarNumber) {
        this.mCarNumber = mCarNumber;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mCarManufactor) {
        this.mEmail = mCarManufactor;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }


}
