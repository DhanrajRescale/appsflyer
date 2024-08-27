package b4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3160e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3162b;

    /* renamed from: c, reason: collision with root package name */
    public int f3163c;

    /* renamed from: d, reason: collision with root package name */
    public char f3164d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f3160e[i10] = Character.getDirectionality(i10);
        }
    }

    public b(CharSequence charSequence) {
        this.f3161a = charSequence;
        this.f3162b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f3163c - 1;
        CharSequence charSequence = this.f3161a;
        char charAt = charSequence.charAt(i10);
        this.f3164d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f3163c);
            this.f3163c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f3163c--;
        char c10 = this.f3164d;
        if (c10 < 1792) {
            return f3160e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
