package of;

import android.text.TextUtils;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f29995a;

    /* renamed from: b, reason: collision with root package name */
    public int f29996b;

    /* renamed from: c, reason: collision with root package name */
    public String f29997c;

    /* renamed from: d, reason: collision with root package name */
    public String f29998d;

    /* renamed from: e, reason: collision with root package name */
    public String f29999e;

    /* renamed from: f, reason: collision with root package name */
    public long f30000f;

    /* renamed from: g, reason: collision with root package name */
    public String f30001g;

    /* JADX WARN: Type inference failed for: r0v6, types: [of.g, java.lang.Object] */
    public static g a(String str) {
        int indexOf = str.indexOf(58);
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (-1 != indexOf) {
            String substring = str.substring(0, indexOf);
            if (indexOf < str.length()) {
                str2 = str.substring(indexOf + 1);
            }
            str = substring;
        }
        String[] split = TextUtils.split(str, Pattern.quote("|"));
        if (split.length >= 6) {
            ?? obj = new Object();
            obj.f30001g = str2;
            obj.f29995a = Integer.parseInt(split[0]);
            obj.f29996b = Integer.parseInt(split[1]);
            obj.f29997c = split[2];
            obj.f29998d = split[3];
            obj.f29999e = split[4];
            obj.f30000f = Long.parseLong(split[5]);
            return obj;
        }
        throw new IllegalArgumentException("Wrong number of fields.");
    }

    public final String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f29995a), Integer.valueOf(this.f29996b), this.f29997c, this.f29998d, this.f29999e, Long.valueOf(this.f30000f)});
    }
}
