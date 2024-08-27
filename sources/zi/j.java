package zi;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.firebase.ui.auth.FirebaseUiException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import vt.p0;
import wl.c0;
import wl.j0;
import wl.t;
import xk.h0;
import xk.x;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42491a;

    public /* synthetic */ j(int i10) {
        this.f42491a = i10;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [wl.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, wl.t] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, zl.a] */
    /* JADX WARN: Type inference failed for: r2v39, types: [android.view.View$BaseSavedState, pm.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [um.i, um.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [xn.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [android.view.View$BaseSavedState, eo.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap m10;
        c0 c0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i10 = 0;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = true;
        i iVar = null;
        LinkedHashMap linkedHashMap = null;
        switch (this.f42491a) {
            case 0:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (i10 != readInt) {
                    i10 = jr.h.e(i.CREATOR, parcel, arrayList, i10, 1);
                }
                return new k(readString, arrayList);
            case 1:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z22 = true;
                }
                if (parcel.readInt() != 0) {
                    iVar = i.CREATOR.createFromParcel(parcel);
                }
                return new s(readString2, z22, iVar);
            case 2:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new xk.a(parcel);
            case 3:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new xk.i(parcel);
            case 4:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new xk.k(parcel);
            case 5:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new xk.l(parcel);
            case 6:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new xk.q(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
            case 7:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new x(parcel);
            case 8:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new h0(parcel);
            case 9:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new wl.b(parcel);
            case 10:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ?? obj = new Object();
                obj.f39184a = parcel.readString();
                obj.f39185b = parcel.readString();
                obj.f39186c = parcel.readString();
                obj.f39187d = parcel.readLong();
                obj.f39188e = parcel.readLong();
                return obj;
            case 11:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new wl.j(parcel);
            case 12:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new wl.m(parcel);
            case 13:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new wl.n(parcel);
            case 14:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new wl.o(parcel);
            case 15:
                Intrinsics.checkNotNullParameter(parcel, "source");
                Intrinsics.checkNotNullParameter(parcel, "source");
                ?? obj2 = new Object();
                obj2.f39277b = -1;
                Parcelable[] readParcelableArray = parcel.readParcelableArray(c0.class.getClassLoader());
                if (readParcelableArray == null) {
                    readParcelableArray = new Parcelable[0];
                }
                ArrayList arrayList2 = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof c0) {
                        c0Var = (c0) parcelable;
                    } else {
                        c0Var = null;
                    }
                    if (c0Var != null) {
                        Intrinsics.checkNotNullParameter(obj2, "<set-?>");
                        c0Var.f39162b = obj2;
                    }
                    if (c0Var != null) {
                        arrayList2.add(c0Var);
                    }
                }
                Object[] array = arrayList2.toArray(new c0[0]);
                if (array != null) {
                    obj2.f39276a = (c0[]) array;
                    obj2.f39277b = parcel.readInt();
                    obj2.f39282g = (wl.q) parcel.readParcelable(wl.q.class.getClassLoader());
                    HashMap O = n0.O(parcel);
                    if (O == null) {
                        m10 = null;
                    } else {
                        m10 = p0.m(O);
                    }
                    obj2.f39283h = m10;
                    HashMap O2 = n0.O(parcel);
                    if (O2 != null) {
                        linkedHashMap = p0.m(O2);
                    }
                    obj2.f39284i = linkedHashMap;
                    return obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            case 16:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new wl.q(parcel);
            case 17:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new wl.s(parcel);
            case 18:
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new j0(parcel);
            case 19:
                ?? obj3 = new Object();
                obj3.f42553b = -1;
                obj3.f42552a = parcel.readInt();
                obj3.f42553b = parcel.readInt();
                Bundle readBundle = parcel.readBundle(zl.a.class.getClassLoader());
                obj3.f42554c = new HashMap();
                for (String str : readBundle.keySet()) {
                    obj3.f42554c.put(str, Integer.valueOf(readBundle.getInt(str)));
                }
                return obj3;
            case 20:
                return new zl.b(parcel);
            case 21:
                am.e eVar = (am.e) parcel.readParcelable(am.e.class.getClassLoader());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() != 1) {
                    z23 = false;
                }
                return new zl.d(eVar, readString3, readString4, z23, (FirebaseUiException) parcel.readSerializable(), (zp.d) parcel.readParcelable(zp.d.class.getClassLoader()));
            case 22:
                return new am.a(parcel);
            case 23:
                String readString5 = parcel.readString();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zl.b.CREATOR);
                zl.b bVar = (zl.b) parcel.readParcelable(zl.b.class.getClassLoader());
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (parcel.readInt() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                return new am.b(readString5, createTypedArrayList, bVar, readInt2, readInt3, readString6, readString7, z10, z11, z12, z13, z14, parcel.readString(), (zp.b) parcel.readParcelable(zp.b.class.getClassLoader()), (zl.a) parcel.readParcelable(zl.a.class.getClassLoader()));
            case 24:
                return new am.e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case 25:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f31172a = parcel.readFloat();
                baseSavedState.f31173b = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                baseSavedState.f31179h = z15;
                baseSavedState.f31174c = parcel.readFloat();
                baseSavedState.f31175d = parcel.readInt();
                baseSavedState.f31176e = parcel.readInt();
                baseSavedState.f31177f = parcel.readInt();
                baseSavedState.f31178g = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                baseSavedState.f31180i = z16;
                if (parcel.readInt() != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                baseSavedState.f31181j = z17;
                if (parcel.readInt() != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                baseSavedState.f31182k = z18;
                if (parcel.readInt() != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                baseSavedState.f31183l = z19;
                if (parcel.readInt() != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                baseSavedState.f31184m = z20;
                if (parcel.readInt() != 0) {
                    z21 = true;
                }
                baseSavedState.f31185n = z21;
                return baseSavedState;
            case 26:
                ?? obj4 = new Object();
                obj4.f37246a = s0.g.f34069a;
                obj4.f37247b = null;
                obj4.f37277c = s0.g.f34069a;
                obj4.f37277c = parcel.readFloat();
                obj4.f37246a = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    obj4.f37247b = parcel.readParcelable(Object.class.getClassLoader());
                }
                return obj4;
            case 27:
            default:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f15760a = ((Integer) parcel.readValue(eo.a.class.getClassLoader())).intValue();
                return baseSavedState2;
            case 28:
                ?? obj5 = new Object();
                obj5.f40510i = 255;
                obj5.f40511j = -2;
                obj5.f40512k = -2;
                obj5.f40518q = Boolean.TRUE;
                obj5.f40502a = parcel.readInt();
                obj5.f40503b = (Integer) parcel.readSerializable();
                obj5.f40504c = (Integer) parcel.readSerializable();
                obj5.f40505d = (Integer) parcel.readSerializable();
                obj5.f40506e = (Integer) parcel.readSerializable();
                obj5.f40507f = (Integer) parcel.readSerializable();
                obj5.f40508g = (Integer) parcel.readSerializable();
                obj5.f40509h = (Integer) parcel.readSerializable();
                obj5.f40510i = parcel.readInt();
                obj5.f40511j = parcel.readInt();
                obj5.f40512k = parcel.readInt();
                obj5.f40514m = parcel.readString();
                obj5.f40515n = parcel.readInt();
                obj5.f40517p = (Integer) parcel.readSerializable();
                obj5.f40519r = (Integer) parcel.readSerializable();
                obj5.f40520s = (Integer) parcel.readSerializable();
                obj5.f40521t = (Integer) parcel.readSerializable();
                obj5.f40522u = (Integer) parcel.readSerializable();
                obj5.f40523v = (Integer) parcel.readSerializable();
                obj5.f40524w = (Integer) parcel.readSerializable();
                obj5.f40518q = (Boolean) parcel.readSerializable();
                obj5.f40513l = (Locale) parcel.readSerializable();
                return obj5;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f42491a) {
            case 0:
                return new k[i10];
            case 1:
                return new s[i10];
            case 2:
                return new xk.a[i10];
            case 3:
                return new xk.i[i10];
            case 4:
                return new xk.k[i10];
            case 5:
                return new xk.l[i10];
            case 6:
                return new xk.q[i10];
            case 7:
                return new x[i10];
            case 8:
                return new h0[i10];
            case 9:
                return new wl.b[i10];
            case 10:
                return new wl.g[i10];
            case 11:
                return new wl.j[i10];
            case 12:
                return new wl.m[i10];
            case 13:
                return new wl.n[i10];
            case 14:
                return new wl.o[i10];
            case 15:
                return new t[i10];
            case 16:
                return new wl.q[i10];
            case 17:
                return new wl.s[i10];
            case 18:
                return new j0[i10];
            case 19:
                return new zl.a[i10];
            case 20:
                return new zl.b[i10];
            case 21:
                return new zl.d[i10];
            case 22:
                return new am.a[i10];
            case 23:
                return new am.b[i10];
            case 24:
                return new am.e[i10];
            case 25:
                return new pm.d[i10];
            case 26:
                return new um.i[i10];
            case 27:
            default:
                return new eo.a[i10];
            case 28:
                return new xn.b[i10];
        }
    }
}
