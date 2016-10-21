import com.fintech.CommandObject.UserCO
import com.fintech.domain.Role
import com.fintech.user.UserManagementService

class BootStrap {

    def userManagementService

    def init = { servletContext ->
        UserCO userCO = new UserCO(username:'admin',password:'admin', email: "amit@gmail.com", confirmPassword: 'admin', admin: true, active: true, roleName: 'admin' );
        if(userCO.validate())
           try {

               userManagementService.registerUser(userCO)
           } catch(Exception e){
                e.printStackTrace()
           }
    }
    def destroy = {
    }
}
