package com.webengage.sdk.android.utils.htmlspanner.j;

import com.webengage.sdk.android.utils.htmlspanner.j.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f12796a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f12797b;

    /* renamed from: c, reason: collision with root package name */
    private String f12798c;

    /* renamed from: d, reason: collision with root package name */
    private String f12799d;

    /* renamed from: e, reason: collision with root package name */
    private String f12800e;

    /* renamed from: f, reason: collision with root package name */
    private final List<d> f12801f;

    /* renamed from: g, reason: collision with root package name */
    private g f12802g;

    /* renamed from: h, reason: collision with root package name */
    private Character f12803h;

    /* renamed from: i, reason: collision with root package name */
    private g f12804i;

    /* renamed from: com.webengage.sdk.android.utils.htmlspanner.j.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0009a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12805a;

        static {
            int[] iArr = new int[g.values().length];
            f12805a = iArr;
            try {
                iArr[g.INSIDE_SELECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12805a[g.INSIDE_COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12805a[g.INSIDE_PROPERTY_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12805a[g.INSIDE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12805a[g.INSIDE_VALUE_ROUND_BRACKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private a() {
        f12796a = 1;
        this.f12798c = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f12799d = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f12800e = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f12801f = new ArrayList();
        this.f12802g = g.INSIDE_SELECTOR;
        this.f12803h = null;
        this.f12804i = null;
        this.f12797b = new ArrayList();
    }

    public static List<e> a(String str) {
        Character valueOf;
        Character ch2;
        a aVar = new a();
        ArrayList arrayList = new ArrayList();
        if (str != null && str.trim().length() != 0) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 < str.length() - 1) {
                    char charAt2 = str.charAt(i10 + 1);
                    valueOf = Character.valueOf(charAt);
                    ch2 = Character.valueOf(charAt2);
                } else {
                    valueOf = Character.valueOf(charAt);
                    ch2 = null;
                }
                aVar.a(arrayList, valueOf, ch2);
            }
        }
        return arrayList;
    }

    private void b(Character ch2) {
        if (b.f12810e.equals(ch2)) {
            this.f12802g = g.INSIDE_PROPERTY_NAME;
            return;
        }
        if (b.f12809d.equals(ch2)) {
            if (this.f12798c.trim().length() == 0) {
                throw new c(c.a.FOUND_COLON_WHEN_READING_SELECTOR_NAME, "Found an ',' in a selector name without any actual name before it.");
            }
            this.f12797b.add(this.f12798c.trim());
            this.f12798c = HttpUrl.FRAGMENT_ENCODE_SET;
            return;
        }
        this.f12798c += ch2;
    }

    private void c(Character ch2) {
        if (b.f12813h.equals(ch2) || b.f12811f.equals(ch2)) {
            this.f12801f.add(new d(this.f12799d.trim(), this.f12800e.trim()));
            this.f12799d = HttpUrl.FRAGMENT_ENCODE_SET;
            this.f12800e = HttpUrl.FRAGMENT_ENCODE_SET;
            this.f12802g = g.INSIDE_PROPERTY_NAME;
            return;
        }
        Character ch3 = b.f12814i;
        if (ch3.equals(ch2)) {
            this.f12800e += ch3;
            this.f12802g = g.INSIDE_VALUE_ROUND_BRACKET;
            return;
        }
        if (b.f12812g.equals(ch2)) {
            this.f12800e += ch2;
            return;
        }
        this.f12800e += ch2;
    }

    private void d(Character ch2) {
        Character ch3 = b.f12815j;
        if (!ch3.equals(ch2)) {
            this.f12800e += ch2;
            return;
        }
        this.f12800e += ch3;
        this.f12802g = g.INSIDE_VALUE;
    }

    private void a(Character ch2) {
        if (b.f12806a.equals(this.f12803h) && b.f12807b.equals(ch2)) {
            this.f12802g = this.f12804i;
        }
    }

    private void a(List<e> list, Character ch2) {
        if (b.f12812g.equals(ch2)) {
            this.f12802g = g.INSIDE_VALUE;
            return;
        }
        if (b.f12813h.equals(ch2)) {
            throw new c(c.a.FOUND_SEMICOLON_WHEN_READING_PROPERTY_NAME, "Unexpected character '" + ch2 + "' for property '" + this.f12799d.trim() + "' in the selector '" + this.f12798c.trim() + "' should end with an ';', not with '}'.");
        }
        if (!b.f12811f.equals(ch2)) {
            this.f12799d += ch2;
            return;
        }
        e eVar = new e();
        Iterator<String> it = this.f12797b.iterator();
        while (it.hasNext()) {
            eVar.a(new f(it.next().trim()));
        }
        this.f12797b.clear();
        f fVar = new f(this.f12798c.trim());
        this.f12798c = HttpUrl.FRAGMENT_ENCODE_SET;
        eVar.a(fVar);
        Iterator<d> it2 = this.f12801f.iterator();
        while (it2.hasNext()) {
            eVar.a(it2.next());
        }
        this.f12801f.clear();
        if (!eVar.a().isEmpty()) {
            list.add(eVar);
        }
        this.f12802g = g.INSIDE_SELECTOR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r5 == com.webengage.sdk.android.utils.htmlspanner.j.b.f12811f) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.List<com.webengage.sdk.android.utils.htmlspanner.j.e> r4, java.lang.Character r5, java.lang.Character r6) {
        /*
            r3 = this;
            char r0 = r5.charValue()
            r1 = 10
            r2 = 1
            if (r0 != r1) goto Le
            int r0 = com.webengage.sdk.android.utils.htmlspanner.j.a.f12796a
            int r0 = r0 + r2
            com.webengage.sdk.android.utils.htmlspanner.j.a.f12796a = r0
        Le:
            java.lang.Character r0 = com.webengage.sdk.android.utils.htmlspanner.j.b.f12807b
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L28
            java.lang.Character r0 = com.webengage.sdk.android.utils.htmlspanner.j.b.f12806a
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L28
            com.webengage.sdk.android.utils.htmlspanner.j.g r6 = r3.f12802g
            com.webengage.sdk.android.utils.htmlspanner.j.g r0 = com.webengage.sdk.android.utils.htmlspanner.j.g.INSIDE_COMMENT
            if (r6 == r0) goto L26
            r3.f12804i = r6
        L26:
            r3.f12802g = r0
        L28:
            int[] r6 = com.webengage.sdk.android.utils.htmlspanner.j.a.C0009a.f12805a
            com.webengage.sdk.android.utils.htmlspanner.j.g r0 = r3.f12802g
            int r0 = r0.ordinal()
            r6 = r6[r0]
            if (r6 == r2) goto L54
            r0 = 2
            if (r6 == r0) goto L50
            r0 = 3
            if (r6 == r0) goto L4c
            r0 = 4
            if (r6 == r0) goto L45
            r4 = 5
            if (r6 == r4) goto L41
            goto L57
        L41:
            r3.d(r5)
            goto L57
        L45:
            r3.c(r5)
            java.lang.Character r6 = com.webengage.sdk.android.utils.htmlspanner.j.b.f12811f
            if (r5 != r6) goto L57
        L4c:
            r3.a(r4, r5)
            goto L57
        L50:
            r3.a(r5)
            goto L57
        L54:
            r3.b(r5)
        L57:
            r3.f12803h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.utils.htmlspanner.j.a.a(java.util.List, java.lang.Character, java.lang.Character):void");
    }
}
