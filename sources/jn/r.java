package jn;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class r implements q {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f21521e;

    /* renamed from: a, reason: collision with root package name */
    public final rn.a f21522a;

    /* renamed from: b, reason: collision with root package name */
    public final rn.a f21523b;

    /* renamed from: c, reason: collision with root package name */
    public final nn.b f21524c;

    /* renamed from: d, reason: collision with root package name */
    public final on.h f21525d;

    public r(rn.a aVar, rn.a aVar2, nn.b bVar, on.h hVar, on.i iVar) {
        this.f21522a = aVar;
        this.f21523b = aVar2;
        this.f21524c = bVar;
        this.f21525d = hVar;
        iVar.getClass();
        iVar.f30147a.execute(new bl.d(iVar, 10));
    }

    public static r a() {
        j jVar = f21521e;
        if (jVar != null) {
            return (r) jVar.f21508g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [b8.f, java.lang.Object] */
    public static void b(Context context) {
        if (f21521e == null) {
            synchronized (r.class) {
                try {
                    if (f21521e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f4092a = context;
                        f21521e = obj.a();
                    }
                } finally {
                }
            }
        }
    }

    public final o c(hn.a aVar) {
        Set singleton;
        byte[] bytes;
        if (aVar instanceof k) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(hn.a.f18621d);
        } else {
            singleton = Collections.singleton(new gn.b("proto"));
        }
        x9.c a10 = i.a();
        aVar.getClass();
        a10.q("cct");
        String str = aVar.f18623a;
        String str2 = aVar.f18624b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            Object[] objArr = new Object[4];
            objArr[0] = "1$";
            objArr[1] = str;
            objArr[2] = "\\";
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            objArr[3] = str2;
            bytes = String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
        }
        a10.f40139c = bytes;
        return new o(singleton, a10.e(), this);
    }
}
