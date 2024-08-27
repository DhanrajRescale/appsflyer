package i0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: g, reason: collision with root package name */
    public static final o1 f19086g = new o1(null, 63);

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f19087a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f19088b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f19089c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f19090d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f19091e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f19092f;

    public o1(Function1 function1, int i10) {
        function1 = (i10 & 16) != 0 ? null : function1;
        this.f19087a = null;
        this.f19088b = null;
        this.f19089c = null;
        this.f19090d = null;
        this.f19091e = function1;
        this.f19092f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (Intrinsics.a(this.f19087a, o1Var.f19087a) && Intrinsics.a(this.f19088b, o1Var.f19088b) && Intrinsics.a(this.f19089c, o1Var.f19089c) && Intrinsics.a(this.f19090d, o1Var.f19090d) && Intrinsics.a(this.f19091e, o1Var.f19091e) && Intrinsics.a(this.f19092f, o1Var.f19092f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        Function1 function1 = this.f19087a;
        if (function1 != null) {
            i10 = function1.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = i10 * 31;
        Function1 function12 = this.f19088b;
        if (function12 != null) {
            i11 = function12.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (i16 + i11) * 31;
        Function1 function13 = this.f19089c;
        if (function13 != null) {
            i12 = function13.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        Function1 function14 = this.f19090d;
        if (function14 != null) {
            i13 = function14.hashCode();
        } else {
            i13 = 0;
        }
        int i19 = (i18 + i13) * 31;
        Function1 function15 = this.f19091e;
        if (function15 != null) {
            i14 = function15.hashCode();
        } else {
            i14 = 0;
        }
        int i20 = (i19 + i14) * 31;
        Function1 function16 = this.f19092f;
        if (function16 != null) {
            i15 = function16.hashCode();
        }
        return i20 + i15;
    }
}
