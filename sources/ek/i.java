package ek;

import java.io.File;

/* loaded from: classes.dex */
public final class i implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15594a;

    public /* synthetic */ i(int i10) {
        this.f15594a = i10;
    }

    @Override // ek.w
    public final boolean a(Object obj) {
        switch (this.f15594a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, xj.k kVar) {
        switch (this.f15594a) {
            case 0:
                File file = (File) obj;
                return new v(new qk.b(file), new g(file, 0));
            default:
                return null;
        }
    }
}
