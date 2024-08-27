package qp;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tp.c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f32116g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f32117h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f32118a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32119b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32120c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f32121d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32122e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32123f;

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f32118a = str;
        this.f32119b = str2;
        this.f32120c = str3;
        this.f32121d = date;
        this.f32122e = j10;
        this.f32123f = j11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tp.c, java.lang.Object] */
    public final c a(String str) {
        ?? obj = new Object();
        obj.f36330a = str;
        obj.f36342m = this.f32121d.getTime();
        obj.f36331b = this.f32118a;
        obj.f36332c = this.f32119b;
        String str2 = this.f32120c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        obj.f36333d = str2;
        obj.f36334e = this.f32122e;
        obj.f36339j = this.f32123f;
        return obj;
    }
}
