package bk;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7038a;

    @Override // bk.a
    public final int a() {
        switch (this.f7038a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    @Override // bk.a
    public final String b() {
        switch (this.f7038a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    @Override // bk.a
    public final int c(Object obj) {
        switch (this.f7038a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    @Override // bk.a
    public final Object newArray(int i10) {
        switch (this.f7038a) {
            case 0:
                return new byte[i10];
            default:
                return new int[i10];
        }
    }
}
