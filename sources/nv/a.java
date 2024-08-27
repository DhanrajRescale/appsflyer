package nv;

import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29175a = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bv.l, bv.k] */
    @Override // nv.o
    public final Object e(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        try {
            ?? obj2 = new Object();
            responseBody.getSource().V(obj2);
            return ResponseBody.create(responseBody.get$contentType(), responseBody.getContentLength(), (bv.l) obj2);
        } finally {
            responseBody.close();
        }
    }
}
