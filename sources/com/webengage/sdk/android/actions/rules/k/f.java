package com.webengage.sdk.android.actions.rules.k;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class f implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private String f12516a;

    /* renamed from: e, reason: collision with root package name */
    private int f12520e;

    /* renamed from: h, reason: collision with root package name */
    private List<Integer> f12523h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12524i;

    /* renamed from: b, reason: collision with root package name */
    private int f12517b = 0;

    /* renamed from: c, reason: collision with root package name */
    private char f12518c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f12519d = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: f, reason: collision with root package name */
    private int f12521f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f12522g = 0;

    public f(String str, boolean z10) {
        this.f12516a = null;
        this.f12520e = 0;
        this.f12524i = false;
        String trim = str.trim();
        this.f12516a = trim;
        this.f12520e = trim.length();
        this.f12523h = new ArrayList();
        this.f12524i = z10;
        if (z10) {
            c();
        }
    }

    private int a(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f12516a.length()) {
            return this.f12516a.charAt(i11);
        }
        return -1;
    }

    private void c() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        this.f12522g = 0;
        boolean z10 = false;
        int i11 = -1;
        while (this.f12522g < this.f12516a.length()) {
            sb2.setLength(0);
            this.f12521f = this.f12522g;
            int i12 = 0;
            int i13 = -1;
            while (true) {
                if (this.f12521f >= this.f12516a.length()) {
                    break;
                }
                char charAt = this.f12516a.charAt(this.f12521f);
                this.f12518c = charAt;
                sb2.append(charAt);
                char c10 = this.f12518c;
                if (c10 == '\"' && i11 == -1 && z10) {
                    this.f12522g = this.f12521f;
                    z10 = false;
                    break;
                }
                if (c10 == '\"' && i11 == 1) {
                    i11 = -1;
                } else if (sb2.toString().equals("\"") && i11 == -1 && !z10) {
                    z10 = true;
                } else if (this.f12518c == '\\' && z10) {
                    i11 *= -1;
                } else if (!z10 && c.a().e(sb2.toString())) {
                    i12 = sb2.length();
                    i13 = this.f12521f;
                }
                this.f12521f++;
            }
            if (i13 != -1) {
                if (this.f12523h.size() == 0) {
                    this.f12523h.add(0);
                    this.f12523h.add(Integer.valueOf((i13 - i12) + 1));
                }
                if (this.f12523h.size() > 0 && ((Integer) nn.d.g(this.f12523h, 1)).intValue() != (i10 = (i13 - i12) + 1)) {
                    List<Integer> list = this.f12523h;
                    list.add((Integer) nn.d.g(list, 1));
                    this.f12523h.add(Integer.valueOf(i10));
                }
                this.f12523h.add(Integer.valueOf((i13 - i12) + 1));
                this.f12523h.add(Integer.valueOf(i13 + 1));
                this.f12522g = i13;
            }
            this.f12522g++;
        }
        if (this.f12523h.size() == 0) {
            this.f12523h.add(0);
            this.f12523h.add(Integer.valueOf(this.f12520e));
        }
        if (this.f12523h.size() > 0 && ((Integer) nn.d.g(this.f12523h, 1)).intValue() != this.f12520e) {
            List<Integer> list2 = this.f12523h;
            list2.add((Integer) nn.d.g(list2, 1));
            this.f12523h.add(Integer.valueOf(this.f12520e));
        }
    }

    public int b(int i10) {
        do {
            i10++;
            if (i10 >= this.f12516a.length()) {
                return -1;
            }
        } while (this.f12516a.charAt(i10) == ' ');
        return this.f12516a.charAt(i10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12524i ? this.f12517b < this.f12523h.size() : this.f12521f < this.f12516a.length();
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!this.f12524i) {
            return b();
        }
        String str = this.f12516a;
        List<Integer> list = this.f12523h;
        int i10 = this.f12517b;
        this.f12517b = i10 + 1;
        int intValue = list.get(i10).intValue();
        List<Integer> list2 = this.f12523h;
        int i11 = this.f12517b;
        this.f12517b = i11 + 1;
        String substring = str.substring(intValue, list2.get(i11).intValue());
        this.f12519d = substring;
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00af. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.rules.k.f.b():java.lang.String");
    }
}
