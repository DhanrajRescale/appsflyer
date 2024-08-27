package b4;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f3176a = new Object();

    @Override // b4.k
    public final int a(CharSequence charSequence, int i10) {
        int i11 = 2;
        for (int i12 = 0; i12 < i10 && i11 == 2; i12++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i12));
            m mVar = n.f3180a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i11 = 2;
                            break;
                    }
                }
                i11 = 0;
            }
            i11 = 1;
        }
        return i11;
    }
}
