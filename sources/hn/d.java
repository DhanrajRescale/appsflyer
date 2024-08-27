package hn;

import android.content.Context;
import android.net.ConnectivityManager;
import in.h;
import java.net.MalformedURLException;
import java.net.URL;
import kn.g;
import ll.o;

/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final o f18631a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f18632b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f18633c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f18634d;

    /* renamed from: e, reason: collision with root package name */
    public final rn.a f18635e;

    /* renamed from: f, reason: collision with root package name */
    public final rn.a f18636f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18637g;

    public d(Context context, rn.a aVar, rn.a aVar2) {
        hq.d dVar = new hq.d();
        h.f20161a.configure(dVar);
        dVar.f18677d = true;
        this.f18631a = new o(dVar, 16);
        this.f18633c = context;
        this.f18632b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f18634d = b(a.f18620c);
        this.f18635e = aVar2;
        this.f18636f = aVar;
        this.f18637g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(a3.a.f("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((in.v) in.v.f20447a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jn.h a(jn.h r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.d.a(jn.h):jn.h");
    }
}
