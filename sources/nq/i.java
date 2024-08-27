package nq;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final long f29097b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f29098c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static i f29099d;

    /* renamed from: a, reason: collision with root package name */
    public final ll.f f29100a;

    public i(ll.f fVar) {
        this.f29100a = fVar;
    }

    public static i a() {
        if (ll.f.f24908b == null) {
            ll.f.f24908b = new ll.f(17);
        }
        ll.f fVar = ll.f.f24908b;
        if (f29099d == null) {
            f29099d = new i(fVar);
        }
        return f29099d;
    }

    public final boolean b(oq.a aVar) {
        if (TextUtils.isEmpty(aVar.f30249c)) {
            return true;
        }
        long j10 = aVar.f30252f + aVar.f30251e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f29100a.getClass();
        if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f29097b) {
            return true;
        }
        return false;
    }
}
