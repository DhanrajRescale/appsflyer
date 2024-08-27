package nv;

import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f29247l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f29248m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f29249a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpUrl f29250b;

    /* renamed from: c, reason: collision with root package name */
    public String f29251c;

    /* renamed from: d, reason: collision with root package name */
    public HttpUrl.Builder f29252d;

    /* renamed from: e, reason: collision with root package name */
    public final Request.Builder f29253e = new Request.Builder();

    /* renamed from: f, reason: collision with root package name */
    public final Headers.Builder f29254f;

    /* renamed from: g, reason: collision with root package name */
    public MediaType f29255g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29256h;

    /* renamed from: i, reason: collision with root package name */
    public final MultipartBody.Builder f29257i;

    /* renamed from: j, reason: collision with root package name */
    public final FormBody.Builder f29258j;

    /* renamed from: k, reason: collision with root package name */
    public RequestBody f29259k;

    public s0(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f29249a = str;
        this.f29250b = httpUrl;
        this.f29251c = str2;
        this.f29255g = mediaType;
        this.f29256h = z10;
        if (headers != null) {
            this.f29254f = headers.newBuilder();
        } else {
            this.f29254f = new Headers.Builder();
        }
        if (z11) {
            this.f29258j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f29257i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public final void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f29255g = MediaType.get(str2);
                return;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(a3.a.f("Malformed content type: ", str2), e10);
            }
        }
        this.f29254f.add(str, str2);
    }

    public final void b(String str, String str2, boolean z10) {
        String str3 = this.f29251c;
        if (str3 != null) {
            HttpUrl httpUrl = this.f29250b;
            HttpUrl.Builder newBuilder = httpUrl.newBuilder(str3);
            this.f29252d = newBuilder;
            if (newBuilder != null) {
                this.f29251c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f29251c);
            }
        }
        if (z10) {
            this.f29252d.addEncodedQueryParameter(str, str2);
        } else {
            this.f29252d.addQueryParameter(str, str2);
        }
    }
}
