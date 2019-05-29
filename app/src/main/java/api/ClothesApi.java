package api;

        import com.example.onlineclothshop.ImageResponse;
        import model.Clothes;

        import java.util.List;

        import model.Users;
        import okhttp3.MultipartBody;
        import retrofit2.Call;
        import retrofit2.http.Body;
        import retrofit2.http.Field;
        import retrofit2.http.FormUrlEncoded;
        import retrofit2.http.GET;
        import retrofit2.http.Multipart;
        import retrofit2.http.POST;
        import retrofit2.http.Part;

public interface ClothesApi  {
    @GET("item")
    Call<List<Clothes>> getClothes();

    @POST("item")
    Call<Void> addItems(@Body Clothes clothes);

    @FormUrlEncoded
    @POST("item")
    Call<Void> addFieldItems (@Field("itemName") String itemName,@Field("itemPrice") String itemPrice,@Field("itemImageName") String itemImageName,@Field("itemDescription") String itemDescription);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);

    @GET("users")
    Call<List<Users>> getUsers();

    @POST("users")
    Call<Void> addUser(@Body Users users);
}