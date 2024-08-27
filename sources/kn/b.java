package kn;

import android.content.Context;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23267a;

    /* renamed from: b, reason: collision with root package name */
    public final rn.a f23268b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f23269c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23270d;

    public b(Context context, rn.a aVar, rn.a aVar2, String str) {
        if (context != null) {
            this.f23267a = context;
            if (aVar != null) {
                this.f23268b = aVar;
                if (aVar2 != null) {
                    this.f23269c = aVar2;
                    if (str != null) {
                        this.f23270d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f23267a.equals(((b) cVar).f23267a)) {
            b bVar = (b) cVar;
            if (this.f23268b.equals(bVar.f23268b) && this.f23269c.equals(bVar.f23269c) && this.f23270d.equals(bVar.f23270d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f23267a.hashCode() ^ 1000003) * 1000003) ^ this.f23268b.hashCode()) * 1000003) ^ this.f23269c.hashCode()) * 1000003) ^ this.f23270d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f23267a);
        sb2.append(", wallClock=");
        sb2.append(this.f23268b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f23269c);
        sb2.append(", backendName=");
        return nn.d.o(sb2, this.f23270d, UrlTreeKt.componentParamSuffix);
    }
}
