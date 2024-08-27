package lj;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f24868a;

    public a(CharSequence transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        this.f24868a = transformation;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        CharSequence charSequence = this.f24868a;
        if (charSequence.charAt(i10) == 8226) {
            return (char) 9679;
        }
        return charSequence.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f24868a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f24868a.subSequence(i10, i11);
    }
}
