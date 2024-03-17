package sit707_week2;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
//        SeleniumOperations.amazon_registration_page("https://www.amazon.com.au/ap/register");
        SeleniumOperations.amazon_registration_page("https://www.amazon.com.au/ap/register?showRememberMe=true&openid.pape.max_auth_age=3600&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&language=en_AU&pageId=CreatorStudio_au&openid.return_to=https%3A%2F%2Fwww.amazon.com.au%2Fcreate%2Faccount&prevRID=FS91NVE0HA9ZNE3MPZCD&openid.assoc_handle=CreatorStudio_au&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }
}
