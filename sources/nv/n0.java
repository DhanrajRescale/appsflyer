package nv;

import okhttp3.MultipartBody;

/* loaded from: classes2.dex */
public final class n0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f29235b = new Object();

    @Override // bl.j
    public final void k(s0 s0Var, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            s0Var.f29257i.addPart(part);
        }
    }
}
