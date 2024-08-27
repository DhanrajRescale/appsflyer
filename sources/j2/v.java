package j2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f20768c = new v(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20769a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20770b;

    public v() {
        this.f20769a = false;
        this.f20770b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f20769a == vVar.f20769a && this.f20770b == vVar.f20770b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20770b) + (Boolean.hashCode(this.f20769a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f20769a + ", emojiSupportMatch=" + ((Object) h.a(this.f20770b)) + ')';
    }

    public v(int i10, boolean z10) {
        this.f20769a = z10;
        this.f20770b = i10;
    }
}
