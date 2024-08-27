package kj;

import com.airbnb.deeplinkdispatch.MetadataMasks;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.model.FlagUrl;
import com.assetgro.stockgro.data.model.OtpChannel;
import java.util.List;
import okhttp3.HttpUrl;
import vt.x;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f23207b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23208c;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f23206a = {-46, 65, 30, Byte.MIN_VALUE, -103, -57, 74, -64, 51, 88, -95, -45, 77, -117, -36, -113, -11, MetadataMasks.ConfigurablePathSegmentMask, -64, 89};

    /* renamed from: d, reason: collision with root package name */
    public static List f23209d = x.a(new CountrySelectDto("India", "IN", "+91", 10, x.a(new OtpChannel("sms", "SMS", HttpUrl.FRAGMENT_ENCODE_SET, 55)), new FlagUrl("https://storage.googleapis.com/stockgro-assets/countries_flag/india.png", "https://storage.googleapis.com/stockgro-assets/countries_flag/india_circular.png"), "https://storage.googleapis.com/home_page_assets_prod/signup_welcome.png", "en_In", new OtpChannel("sms", "SMS", HttpUrl.FRAGMENT_ENCODE_SET, 59)));
}
