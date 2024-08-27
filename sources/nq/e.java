package nq;

import com.google.android.gms.tasks.TaskCompletionSource;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final i f29092a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f29093b;

    public e(i iVar, TaskCompletionSource taskCompletionSource) {
        this.f29092a = iVar;
        this.f29093b = taskCompletionSource;
    }

    @Override // nq.h
    public final boolean a(Exception exc) {
        this.f29093b.trySetException(exc);
        return true;
    }

    @Override // nq.h
    public final boolean b(oq.a aVar) {
        if (aVar.f30248b == oq.c.f30260d && !this.f29092a.b(aVar)) {
            String str = aVar.f30249c;
            if (str != null) {
                Long valueOf = Long.valueOf(aVar.f30251e);
                Long valueOf2 = Long.valueOf(aVar.f30252f);
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (valueOf == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET.concat(" tokenExpirationTimestamp");
                }
                if (valueOf2 == null) {
                    str2 = jr.h.r(str2, " tokenCreationTimestamp");
                }
                if (str2.isEmpty()) {
                    this.f29093b.setResult(new a(str, valueOf.longValue(), valueOf2.longValue()));
                    return true;
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
