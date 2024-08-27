package k6;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import hb.e0;
import hb.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k7.e2;
import k7.f2;
import kotlin.jvm.internal.Intrinsics;
import lp.o0;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22232a;

    public /* synthetic */ d(int i10) {
        this.f22232a = i10;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, k7.o0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [k7.e2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [k7.f2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.view.View$BaseSavedState, j9.g, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) {
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj = null;
        boolean z13 = false;
        int i10 = 0;
        boolean z14 = false;
        int i11 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        switch (this.f22232a) {
            case 0:
                return new e(inParcel);
            case 1:
                return new f(inParcel);
            case 2:
                return new g(inParcel);
            case 3:
                return new l(inParcel);
            case 4:
                return new m(inParcel);
            case 5:
                return new n(inParcel);
            case 6:
                String readString = inParcel.readString();
                readString.getClass();
                String readString2 = inParcel.readString();
                String[] createStringArray = inParcel.createStringArray();
                createStringArray.getClass();
                return new o(readString, readString2, o0.r(createStringArray));
            case 7:
                return new p(inParcel);
            case 8:
                return new l6.a(inParcel);
            case 9:
                ArrayList arrayList = new ArrayList();
                inParcel.readList(arrayList, l6.b.class.getClassLoader());
                return new l6.c(arrayList);
            case 10:
                return new l6.b(inParcel.readInt(), inParcel.readLong(), inParcel.readLong());
            case 11:
                return new l6.d(inParcel);
            case 12:
                return new m6.a(inParcel);
            case 13:
                return new m6.e(inParcel);
            case 14:
                return new Object();
            case 15:
                return new m6.i(inParcel);
            case 16:
                return new m6.j(inParcel.readLong(), inParcel.readLong());
            case 17:
                return new i6.b(inParcel);
            case 18:
                Intrinsics.checkNotNullParameter(inParcel, "inParcel");
                return new androidx.navigation.o(inParcel);
            case 19:
                ?? obj2 = new Object();
                obj2.f22510a = inParcel.readInt();
                obj2.f22511b = inParcel.readInt();
                if (inParcel.readInt() == 1) {
                    z13 = true;
                }
                obj2.f22512c = z13;
                return obj2;
            case 20:
                ?? obj3 = new Object();
                obj3.f22337a = inParcel.readInt();
                obj3.f22338b = inParcel.readInt();
                if (inParcel.readInt() == 1) {
                    z17 = true;
                }
                obj3.f22340d = z17;
                int readInt = inParcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj3.f22339c = iArr;
                    inParcel.readIntArray(iArr);
                }
                return obj3;
            case 21:
                ?? obj4 = new Object();
                obj4.f22348a = inParcel.readInt();
                obj4.f22349b = inParcel.readInt();
                int readInt2 = inParcel.readInt();
                obj4.f22350c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj4.f22351d = iArr2;
                    inParcel.readIntArray(iArr2);
                }
                int readInt3 = inParcel.readInt();
                obj4.f22352e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj4.f22353f = iArr3;
                    inParcel.readIntArray(iArr3);
                }
                if (inParcel.readInt() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                obj4.f22355h = z10;
                if (inParcel.readInt() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                obj4.f22356i = z11;
                if (inParcel.readInt() == 1) {
                    z16 = true;
                }
                obj4.f22357j = z16;
                obj4.f22354g = inParcel.readArrayList(e2.class.getClassLoader());
                return obj4;
            case 22:
                return new ParcelImpl(inParcel);
            case 23:
                String readString3 = inParcel.readString();
                Intrinsics.c(readString3);
                int readInt4 = inParcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
                for (int i12 = 0; i12 < readInt4; i12++) {
                    String readString4 = inParcel.readString();
                    Intrinsics.c(readString4);
                    String readString5 = inParcel.readString();
                    Intrinsics.c(readString5);
                    linkedHashMap.put(readString4, readString5);
                }
                return new w8.c(readString3, linkedHashMap);
            case 24:
                ?? baseSavedState = new View.BaseSavedState(inParcel);
                baseSavedState.f21148a = inParcel.readString();
                baseSavedState.f21150c = inParcel.readFloat();
                if (inParcel.readInt() == 1) {
                    z15 = true;
                }
                baseSavedState.f21151d = z15;
                baseSavedState.f21152e = inParcel.readString();
                baseSavedState.f21153f = inParcel.readInt();
                baseSavedState.f21154g = inParcel.readInt();
                return baseSavedState;
            case 25:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                z valueOf = z.valueOf(inParcel.readString());
                String readString6 = inParcel.readString();
                String readString7 = inParcel.readString();
                if (inParcel.readInt() != 0) {
                    obj = hb.i.CREATOR.createFromParcel(inParcel);
                }
                return new hb.j(valueOf, readString6, readString7, (hb.i) obj, inParcel.createStringArrayList(), inParcel.createStringArrayList());
            case 26:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new hb.b(inParcel.readDouble(), inParcel.readDouble(), hb.a.valueOf(inParcel.readString()));
            case 27:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                e0 valueOf2 = e0.valueOf(inParcel.readString());
                if (inParcel.readInt() != 0) {
                    obj = hb.d.CREATOR.createFromParcel(inParcel);
                }
                hb.d dVar = (hb.d) obj;
                double readDouble = inParcel.readDouble();
                double readDouble2 = inParcel.readDouble();
                if (inParcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                hb.c createFromParcel = hb.c.CREATOR.createFromParcel(inParcel);
                int readInt5 = inParcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt5);
                int i13 = 0;
                while (i13 != readInt5) {
                    i13 = jr.h.e(hb.h.CREATOR, inParcel, arrayList2, i13, 1);
                }
                int readInt6 = inParcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt6);
                while (i11 != readInt6) {
                    i11 = jr.h.e(hb.g.CREATOR, inParcel, arrayList3, i11, 1);
                }
                return new hb.i(valueOf2, dVar, readDouble, readDouble2, z12, createFromParcel, arrayList2, arrayList3);
            case 28:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                float readFloat = inParcel.readFloat();
                float readFloat2 = inParcel.readFloat();
                float readFloat3 = inParcel.readFloat();
                if (inParcel.readInt() != 0) {
                    z14 = true;
                }
                return new hb.c(readFloat, readFloat2, readFloat3, z14);
            default:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                String readString8 = inParcel.readString();
                String readString9 = inParcel.readString();
                String readString10 = inParcel.readString();
                double readDouble3 = inParcel.readDouble();
                hb.b createFromParcel2 = hb.b.CREATOR.createFromParcel(inParcel);
                int readInt7 = inParcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt7);
                while (i10 != readInt7) {
                    i10 = jr.h.e(hb.f.CREATOR, inParcel, arrayList4, i10, 1);
                }
                return new hb.d(readString8, readString9, readString10, readDouble3, createFromParcel2, arrayList4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f22232a) {
            case 0:
                return new e[i10];
            case 1:
                return new f[i10];
            case 2:
                return new g[i10];
            case 3:
                return new l[i10];
            case 4:
                return new m[i10];
            case 5:
                return new n[i10];
            case 6:
                return new o[i10];
            case 7:
                return new p[i10];
            case 8:
                return new l6.a[i10];
            case 9:
                return new l6.c[i10];
            case 10:
                return new l6.b[i10];
            case 11:
                return new l6.d[i10];
            case 12:
                return new m6.a[i10];
            case 13:
                return new m6.e[i10];
            case 14:
                return new m6.f[i10];
            case 15:
                return new m6.i[i10];
            case 16:
                return new m6.j[i10];
            case 17:
                return new n6.a[i10];
            case 18:
                return new androidx.navigation.o[i10];
            case 19:
                return new k7.o0[i10];
            case 20:
                return new e2[i10];
            case 21:
                return new f2[i10];
            case 22:
                return new ParcelImpl[i10];
            case 23:
                return new w8.c[i10];
            case 24:
                return new j9.g[i10];
            case 25:
                return new hb.j[i10];
            case 26:
                return new hb.b[i10];
            case 27:
                return new hb.i[i10];
            case 28:
                return new hb.c[i10];
            default:
                return new hb.d[i10];
        }
    }
}
