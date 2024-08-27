package com.webengage.sdk.android.utils.htmlspanner.n;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.utils.htmlspanner.d;
import com.webengage.sdk.android.utils.htmlspanner.m.e;
import com.webengage.sdk.android.utils.htmlspanner.n.a;

/* loaded from: classes2.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12911a = Resources.getSystem().getDisplayMetrics().densityDpi / 160;

    /* renamed from: b, reason: collision with root package name */
    private int f12912b;

    /* renamed from: c, reason: collision with root package name */
    private int f12913c;

    /* renamed from: d, reason: collision with root package name */
    private com.webengage.sdk.android.utils.htmlspanner.a f12914d;

    /* renamed from: e, reason: collision with root package name */
    private com.webengage.sdk.android.utils.htmlspanner.n.a f12915e;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12916a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12917b;

        static {
            int[] iArr = new int[a.f.values().length];
            f12917b = iArr;
            try {
                iArr[a.f.UNDERLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12917b[a.f.LINETHROUGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[a.e.values().length];
            f12916a = iArr2;
            try {
                iArr2[a.e.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12916a[a.e.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12916a[a.e.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public b(com.webengage.sdk.android.utils.htmlspanner.a aVar, com.webengage.sdk.android.utils.htmlspanner.n.a aVar2, int i10, int i11) {
        this.f12914d = aVar;
        this.f12915e = aVar2;
        this.f12912b = i10;
        this.f12913c = i11;
    }

    private e a(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        e[] eVarArr = (e[]) spannableStringBuilder.getSpans(i10, i11, e.class);
        if (eVarArr == null || eVarArr.length <= 0) {
            return null;
        }
        return eVarArr[eVarArr.length - 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b3  */
    @Override // com.webengage.sdk.android.utils.htmlspanner.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.webengage.sdk.android.utils.htmlspanner.c r10, android.text.SpannableStringBuilder r11) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.utils.htmlspanner.n.b.a(com.webengage.sdk.android.utils.htmlspanner.c, android.text.SpannableStringBuilder):void");
    }
}
