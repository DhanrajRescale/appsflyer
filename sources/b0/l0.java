package b0;

/* loaded from: classes.dex */
public final class l0 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f2918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int[] iArr, int i10) {
        super(3);
        this.f2917a = i10;
        this.f2918b = iArr;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int[] iArr = this.f2918b;
        int i10 = this.f2917a;
        switch (i10) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                switch (i10) {
                    case 0:
                        return Integer.valueOf(iArr[intValue]);
                    default:
                        return Integer.valueOf(iArr[intValue]);
                }
            default:
                int intValue2 = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                switch (i10) {
                    case 0:
                        return Integer.valueOf(iArr[intValue2]);
                    default:
                        return Integer.valueOf(iArr[intValue2]);
                }
        }
    }
}
