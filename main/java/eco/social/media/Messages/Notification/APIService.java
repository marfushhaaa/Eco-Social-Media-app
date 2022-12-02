package eco.social.media.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=BOFv3tgWczbuN2cdKwP9sZjWTvvHDeTcAtussdRcGXauqsHL5x1PlB_t9_Zz6ScW-bR0v8z4oF1QNIsn24tkcuQ"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
