package l2;

import da.e;
import java.text.BreakIterator;
import java.util.Locale;
import k2.c;
import p1.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f23930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23931b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23932c;

    /* renamed from: d, reason: collision with root package name */
    public final BreakIterator f23933d;

    public b(CharSequence charSequence, int i10, Locale locale) {
        this.f23930a = charSequence;
        if (charSequence.length() >= 0) {
            if (i10 >= 0 && i10 <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.f23933d = wordInstance;
                this.f23931b = Math.max(0, -50);
                this.f23932c = Math.min(charSequence.length(), i10 + 50);
                wordInstance.setText(new c(charSequence, i10));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    public final void a(int i10) {
        int i11 = this.f23931b;
        int i12 = this.f23932c;
        if (i10 <= i12 && i11 <= i10) {
        } else {
            throw new IllegalArgumentException(a3.a.i(e.q("Invalid offset: ", i10, ". Valid range is [", i11, " , "), i12, ']').toString());
        }
    }

    public final boolean b(int i10) {
        int i11 = this.f23931b + 1;
        if (i10 <= this.f23932c && i11 <= i10 && Character.isLetterOrDigit(Character.codePointBefore(this.f23930a, i10))) {
            return true;
        }
        return false;
    }

    public final boolean c(int i10) {
        int i11 = this.f23931b + 1;
        if (i10 <= this.f23932c && i11 <= i10) {
            return l.b(Character.codePointBefore(this.f23930a, i10));
        }
        return false;
    }

    public final boolean d(int i10) {
        if (i10 < this.f23932c && this.f23931b <= i10 && Character.isLetterOrDigit(Character.codePointAt(this.f23930a, i10))) {
            return true;
        }
        return false;
    }

    public final boolean e(int i10) {
        if (i10 < this.f23932c && this.f23931b <= i10) {
            return l.b(Character.codePointAt(this.f23930a, i10));
        }
        return false;
    }
}
