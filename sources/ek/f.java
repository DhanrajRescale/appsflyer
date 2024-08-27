package ek;

import java.io.File;

/* loaded from: classes.dex */
public final class f implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15585a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15586b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f15585a = i10;
        this.f15586b = obj;
    }

    @Override // ek.w
    public final boolean a(Object obj) {
        switch (this.f15585a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, xj.k kVar) {
        int i12 = this.f15585a;
        Object obj2 = this.f15586b;
        switch (i12) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new v(new qk.b(bArr), new d(bArr, (c) obj2));
            case 1:
                return new v(new qk.b(obj), new j(0, obj.toString(), (t9.c) obj2));
            default:
                File file = (File) obj;
                return new v(new qk.b(file), new j(1, file, (k) obj2));
        }
    }
}
