package s8;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final ut.g f34326a;

    /* renamed from: b, reason: collision with root package name */
    public final ut.g f34327b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34328c;

    public i(ut.g gVar, ut.g gVar2, boolean z10) {
        this.f34326a = gVar;
        this.f34327b = gVar2;
        this.f34328c = z10;
    }

    @Override // s8.f
    public final g a(Object obj, y8.m mVar, n8.i iVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.a(uri.getScheme(), "http") && !Intrinsics.a(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), mVar, this.f34326a, this.f34327b, this.f34328c);
    }
}
