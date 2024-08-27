package androidx.compose.ui.input.pointer;

import c2.y0;
import g1.n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x1.o0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Lc2/y0;", "Lx1/o0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1391b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1392c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f1393d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f1394e;

    public SuspendPointerInputElement(Object obj, Object obj2, Function2 function2, int i10) {
        obj = (i10 & 1) != 0 ? null : obj;
        obj2 = (i10 & 2) != 0 ? null : obj2;
        this.f1391b = obj;
        this.f1392c = obj2;
        this.f1393d = null;
        this.f1394e = function2;
    }

    @Override // c2.y0
    public final n d() {
        return new o0(this.f1394e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Intrinsics.a(this.f1391b, suspendPointerInputElement.f1391b) || !Intrinsics.a(this.f1392c, suspendPointerInputElement.f1392c)) {
            return false;
        }
        Object[] objArr = this.f1393d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f1393d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f1393d != null) {
            return false;
        }
        return true;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Object obj = this.f1391b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Object obj2 = this.f1392c;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Object[] objArr = this.f1393d;
        if (objArr != null) {
            i12 = Arrays.hashCode(objArr);
        }
        return i14 + i12;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        o0 o0Var = (o0) nVar;
        o0Var.S0();
        o0Var.f39898n = this.f1394e;
    }
}
