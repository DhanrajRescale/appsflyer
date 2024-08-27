package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f27449d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f27450e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f27451f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27452a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27453b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f27454c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27450e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f27451f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] e(Barrier barrier, String str) {
        int i10;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Object obj = null;
            try {
                i10 = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1461m) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f1461m.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i10 = ((Integer) obj).intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:127:0x0604. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v185, types: [m3.h, java.lang.Object] */
    public static i f(Context context, AttributeSet attributeSet, boolean z10) {
        int[] iArr;
        int i10;
        String str;
        String str2;
        SparseIntArray sparseIntArray;
        String str3;
        i iVar = new i();
        if (z10) {
            iArr = r.f27458c;
        } else {
            iArr = r.f27456a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        int[] iArr2 = f27449d;
        SparseIntArray sparseIntArray2 = f27450e;
        String[] strArr = e3.a.f14958a;
        l lVar = iVar.f27375b;
        m mVar = iVar.f27378e;
        k kVar = iVar.f27376c;
        j jVar = iVar.f27377d;
        String str4 = "Unknown attribute 0x";
        if (!z10) {
            String str5 = "CURRENTLY UNSUPPORTED";
            String str6 = "Unknown attribute 0x";
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i11 = 0;
            while (i11 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index != 1 && 23 != index && 24 != index) {
                    kVar.getClass();
                    jVar.getClass();
                    lVar.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray2.get(index)) {
                    case 1:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27410p = i(obtainStyledAttributes, index, jVar.f27410p);
                        break;
                    case 2:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.I = obtainStyledAttributes.getDimensionPixelSize(index, jVar.I);
                        break;
                    case 3:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27408o = i(obtainStyledAttributes, index, jVar.f27408o);
                        break;
                    case 4:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27407n = i(obtainStyledAttributes, index, jVar.f27407n);
                        break;
                    case 5:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27419y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.C = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.C);
                        break;
                    case 7:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.D = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.D);
                        break;
                    case 8:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.J = obtainStyledAttributes.getDimensionPixelSize(index, jVar.J);
                        break;
                    case 9:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27416v = i(obtainStyledAttributes, index, jVar.f27416v);
                        break;
                    case 10:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27415u = i(obtainStyledAttributes, index, jVar.f27415u);
                        break;
                    case 11:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.P = obtainStyledAttributes.getDimensionPixelSize(index, jVar.P);
                        break;
                    case 12:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, jVar.Q);
                        break;
                    case 13:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.M = obtainStyledAttributes.getDimensionPixelSize(index, jVar.M);
                        break;
                    case 14:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.O = obtainStyledAttributes.getDimensionPixelSize(index, jVar.O);
                        break;
                    case 15:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.R = obtainStyledAttributes.getDimensionPixelSize(index, jVar.R);
                        break;
                    case 16:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.N = obtainStyledAttributes.getDimensionPixelSize(index, jVar.N);
                        break;
                    case 17:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27387d = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f27387d);
                        break;
                    case 18:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27389e = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f27389e);
                        break;
                    case 19:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27391f = obtainStyledAttributes.getFloat(index, jVar.f27391f);
                        break;
                    case 20:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27417w = obtainStyledAttributes.getFloat(index, jVar.f27417w);
                        break;
                    case 21:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27385c = obtainStyledAttributes.getLayoutDimension(index, jVar.f27385c);
                        break;
                    case 22:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        lVar.f27431a = iArr2[obtainStyledAttributes.getInt(index, lVar.f27431a)];
                        break;
                    case 23:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27383b = obtainStyledAttributes.getLayoutDimension(index, jVar.f27383b);
                        break;
                    case 24:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.F = obtainStyledAttributes.getDimensionPixelSize(index, jVar.F);
                        break;
                    case 25:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27395h = i(obtainStyledAttributes, index, jVar.f27395h);
                        break;
                    case 26:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27397i = i(obtainStyledAttributes, index, jVar.f27397i);
                        break;
                    case 27:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.E = obtainStyledAttributes.getInt(index, jVar.E);
                        break;
                    case 28:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.G = obtainStyledAttributes.getDimensionPixelSize(index, jVar.G);
                        break;
                    case 29:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27399j = i(obtainStyledAttributes, index, jVar.f27399j);
                        break;
                    case 30:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27401k = i(obtainStyledAttributes, index, jVar.f27401k);
                        break;
                    case 31:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.K = obtainStyledAttributes.getDimensionPixelSize(index, jVar.K);
                        break;
                    case 32:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27413s = i(obtainStyledAttributes, index, jVar.f27413s);
                        break;
                    case 33:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27414t = i(obtainStyledAttributes, index, jVar.f27414t);
                        break;
                    case 34:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.H = obtainStyledAttributes.getDimensionPixelSize(index, jVar.H);
                        break;
                    case 35:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27405m = i(obtainStyledAttributes, index, jVar.f27405m);
                        break;
                    case 36:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27403l = i(obtainStyledAttributes, index, jVar.f27403l);
                        break;
                    case 37:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27418x = obtainStyledAttributes.getFloat(index, jVar.f27418x);
                        break;
                    case 38:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        iVar.f27374a = obtainStyledAttributes.getResourceId(index, iVar.f27374a);
                        break;
                    case 39:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.U = obtainStyledAttributes.getFloat(index, jVar.U);
                        break;
                    case 40:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.T = obtainStyledAttributes.getFloat(index, jVar.T);
                        break;
                    case 41:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.V = obtainStyledAttributes.getInt(index, jVar.V);
                        break;
                    case 42:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.W = obtainStyledAttributes.getInt(index, jVar.W);
                        break;
                    case 43:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        lVar.f27433c = obtainStyledAttributes.getFloat(index, lVar.f27433c);
                        break;
                    case 44:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27447l = true;
                        mVar.f27448m = obtainStyledAttributes.getDimension(index, mVar.f27448m);
                        break;
                    case 45:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27437b = obtainStyledAttributes.getFloat(index, mVar.f27437b);
                        break;
                    case 46:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27438c = obtainStyledAttributes.getFloat(index, mVar.f27438c);
                        break;
                    case 47:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27439d = obtainStyledAttributes.getFloat(index, mVar.f27439d);
                        break;
                    case 48:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27440e = obtainStyledAttributes.getFloat(index, mVar.f27440e);
                        break;
                    case 49:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27441f = obtainStyledAttributes.getDimension(index, mVar.f27441f);
                        break;
                    case 50:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27442g = obtainStyledAttributes.getDimension(index, mVar.f27442g);
                        break;
                    case 51:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27444i = obtainStyledAttributes.getDimension(index, mVar.f27444i);
                        break;
                    case 52:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27445j = obtainStyledAttributes.getDimension(index, mVar.f27445j);
                        break;
                    case 53:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27446k = obtainStyledAttributes.getDimension(index, mVar.f27446k);
                        break;
                    case 54:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.X = obtainStyledAttributes.getInt(index, jVar.X);
                        break;
                    case 55:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.Y = obtainStyledAttributes.getInt(index, jVar.Y);
                        break;
                    case 56:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.Z = obtainStyledAttributes.getDimensionPixelSize(index, jVar.Z);
                        break;
                    case 57:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27382a0 = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f27382a0);
                        break;
                    case 58:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27384b0 = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f27384b0);
                        break;
                    case 59:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27386c0 = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f27386c0);
                        break;
                    case 60:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f27436a = obtainStyledAttributes.getFloat(index, mVar.f27436a);
                        break;
                    case 61:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f27420z = i(obtainStyledAttributes, index, jVar.f27420z);
                        break;
                    case 62:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.A = obtainStyledAttributes.getDimensionPixelSize(index, jVar.A);
                        break;
                    case 63:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.B = obtainStyledAttributes.getFloat(index, jVar.B);
                        break;
                    case 64:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f27422a = i(obtainStyledAttributes, index, kVar.f27422a);
                        break;
                    case 65:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            kVar.getClass();
                            break;
                        } else {
                            String str7 = strArr[obtainStyledAttributes.getInteger(index, 0)];
                            kVar.getClass();
                            break;
                        }
                    case 66:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        obtainStyledAttributes.getInt(index, 0);
                        kVar.getClass();
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 67:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        kVar.f27426e = obtainStyledAttributes.getFloat(index, kVar.f27426e);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 68:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        lVar.f27434d = obtainStyledAttributes.getFloat(index, lVar.f27434d);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 69:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        jVar.f27388d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 70:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        jVar.f27390e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 71:
                        i10 = indexCount;
                        str = str5;
                        str2 = str6;
                        Log.e("ConstraintSet", str);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 72:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27392f0 = obtainStyledAttributes.getInt(index, jVar.f27392f0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 73:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27394g0 = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f27394g0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 74:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27400j0 = obtainStyledAttributes.getString(index);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 75:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.n0 = obtainStyledAttributes.getBoolean(index, jVar.n0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 76:
                        i10 = indexCount;
                        str2 = str6;
                        kVar.f27424c = obtainStyledAttributes.getInt(index, kVar.f27424c);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 77:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27402k0 = obtainStyledAttributes.getString(index);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 78:
                        i10 = indexCount;
                        str2 = str6;
                        lVar.f27432b = obtainStyledAttributes.getInt(index, lVar.f27432b);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 79:
                        i10 = indexCount;
                        str2 = str6;
                        kVar.f27425d = obtainStyledAttributes.getFloat(index, kVar.f27425d);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 80:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27404l0 = obtainStyledAttributes.getBoolean(index, jVar.f27404l0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 81:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27406m0 = obtainStyledAttributes.getBoolean(index, jVar.f27406m0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 82:
                        i10 = indexCount;
                        str2 = str6;
                        kVar.f27423b = obtainStyledAttributes.getInteger(index, kVar.f27423b);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 83:
                        i10 = indexCount;
                        str2 = str6;
                        mVar.f27443h = i(obtainStyledAttributes, index, mVar.f27443h);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 84:
                        i10 = indexCount;
                        str2 = str6;
                        kVar.f27428g = obtainStyledAttributes.getInteger(index, kVar.f27428g);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 85:
                        i10 = indexCount;
                        str2 = str6;
                        kVar.f27427f = obtainStyledAttributes.getFloat(index, kVar.f27427f);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 86:
                        i10 = indexCount;
                        str2 = str6;
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            kVar.f27430i = obtainStyledAttributes.getResourceId(index, -1);
                        } else if (i12 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.f27429h = string;
                            if (string.indexOf("/") > 0) {
                                kVar.f27430i = obtainStyledAttributes.getResourceId(index, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index, kVar.f27430i);
                        }
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 87:
                        i10 = indexCount;
                        str2 = str6;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str6;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i10 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray2.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 91:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27411q = i(obtainStyledAttributes, index, jVar.f27411q);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 92:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27412r = i(obtainStyledAttributes, index, jVar.f27412r);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 93:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.L = obtainStyledAttributes.getDimensionPixelSize(index, jVar.L);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 94:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.S = obtainStyledAttributes.getDimensionPixelSize(index, jVar.S);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 95:
                        i10 = indexCount;
                        str2 = str6;
                        j(jVar, obtainStyledAttributes, index, 0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 96:
                        i10 = indexCount;
                        str2 = str6;
                        j(jVar, obtainStyledAttributes, index, 1);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 97:
                        i10 = indexCount;
                        str2 = str6;
                        jVar.f27409o0 = obtainStyledAttributes.getInt(index, jVar.f27409o0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                }
                i11++;
                indexCount = i10;
                str6 = str2;
                sparseIntArray2 = sparseIntArray;
                str5 = str;
            }
            if (jVar.f27400j0 != null) {
                jVar.f27398i0 = null;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            ?? obj = new Object();
            obj.f27362a = new int[10];
            obj.f27363b = new int[10];
            obj.f27364c = 0;
            obj.f27365d = new int[10];
            obj.f27366e = new float[10];
            obj.f27367f = 0;
            obj.f27368g = new int[5];
            obj.f27369h = new String[5];
            obj.f27370i = 0;
            obj.f27371j = new int[4];
            obj.f27372k = new boolean[4];
            obj.f27373l = 0;
            kVar.getClass();
            jVar.getClass();
            lVar.getClass();
            mVar.getClass();
            int i13 = 0;
            while (i13 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i13);
                int i14 = indexCount2;
                switch (f27451f.get(index2)) {
                    case 2:
                        str3 = str4;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.I));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb3 = new StringBuilder(str4);
                        str3 = str4;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray2.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 5:
                        str3 = str4;
                        obj.c(5, obtainStyledAttributes.getString(index2));
                        continue;
                    case 6:
                        str3 = str4;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C));
                        break;
                    case 7:
                        str3 = str4;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.D));
                        break;
                    case 8:
                        str3 = str4;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.J));
                        break;
                    case 11:
                        str3 = str4;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.P));
                        break;
                    case 12:
                        str3 = str4;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q));
                        break;
                    case 13:
                        str3 = str4;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.M));
                        break;
                    case 14:
                        str3 = str4;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.O));
                        break;
                    case 15:
                        str3 = str4;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.R));
                        break;
                    case 16:
                        str3 = str4;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.N));
                        break;
                    case 17:
                        str3 = str4;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f27387d));
                        break;
                    case 18:
                        str3 = str4;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f27389e));
                        break;
                    case 19:
                        str3 = str4;
                        obj.a(19, obtainStyledAttributes.getFloat(index2, jVar.f27391f));
                        break;
                    case 20:
                        str3 = str4;
                        obj.a(20, obtainStyledAttributes.getFloat(index2, jVar.f27417w));
                        break;
                    case 21:
                        str3 = str4;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index2, jVar.f27385c));
                        break;
                    case 22:
                        str3 = str4;
                        obj.b(22, iArr2[obtainStyledAttributes.getInt(index2, lVar.f27431a)]);
                        break;
                    case 23:
                        str3 = str4;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index2, jVar.f27383b));
                        break;
                    case 24:
                        str3 = str4;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.F));
                        break;
                    case 27:
                        str3 = str4;
                        obj.b(27, obtainStyledAttributes.getInt(index2, jVar.E));
                        break;
                    case 28:
                        str3 = str4;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.G));
                        break;
                    case 31:
                        str3 = str4;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.K));
                        break;
                    case 34:
                        str3 = str4;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.H));
                        break;
                    case 37:
                        str3 = str4;
                        obj.a(37, obtainStyledAttributes.getFloat(index2, jVar.f27418x));
                        break;
                    case 38:
                        str3 = str4;
                        int resourceId = obtainStyledAttributes.getResourceId(index2, iVar.f27374a);
                        iVar.f27374a = resourceId;
                        obj.b(38, resourceId);
                        break;
                    case 39:
                        str3 = str4;
                        obj.a(39, obtainStyledAttributes.getFloat(index2, jVar.U));
                        break;
                    case 40:
                        str3 = str4;
                        obj.a(40, obtainStyledAttributes.getFloat(index2, jVar.T));
                        break;
                    case 41:
                        str3 = str4;
                        obj.b(41, obtainStyledAttributes.getInt(index2, jVar.V));
                        break;
                    case 42:
                        str3 = str4;
                        obj.b(42, obtainStyledAttributes.getInt(index2, jVar.W));
                        break;
                    case 43:
                        str3 = str4;
                        obj.a(43, obtainStyledAttributes.getFloat(index2, lVar.f27433c));
                        break;
                    case 44:
                        str3 = str4;
                        obj.d(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index2, mVar.f27448m));
                        break;
                    case 45:
                        str3 = str4;
                        obj.a(45, obtainStyledAttributes.getFloat(index2, mVar.f27437b));
                        break;
                    case 46:
                        str3 = str4;
                        obj.a(46, obtainStyledAttributes.getFloat(index2, mVar.f27438c));
                        break;
                    case 47:
                        str3 = str4;
                        obj.a(47, obtainStyledAttributes.getFloat(index2, mVar.f27439d));
                        break;
                    case 48:
                        str3 = str4;
                        obj.a(48, obtainStyledAttributes.getFloat(index2, mVar.f27440e));
                        break;
                    case 49:
                        str3 = str4;
                        obj.a(49, obtainStyledAttributes.getDimension(index2, mVar.f27441f));
                        break;
                    case 50:
                        str3 = str4;
                        obj.a(50, obtainStyledAttributes.getDimension(index2, mVar.f27442g));
                        break;
                    case 51:
                        str3 = str4;
                        obj.a(51, obtainStyledAttributes.getDimension(index2, mVar.f27444i));
                        break;
                    case 52:
                        str3 = str4;
                        obj.a(52, obtainStyledAttributes.getDimension(index2, mVar.f27445j));
                        break;
                    case 53:
                        str3 = str4;
                        obj.a(53, obtainStyledAttributes.getDimension(index2, mVar.f27446k));
                        break;
                    case 54:
                        str3 = str4;
                        obj.b(54, obtainStyledAttributes.getInt(index2, jVar.X));
                        break;
                    case 55:
                        str3 = str4;
                        obj.b(55, obtainStyledAttributes.getInt(index2, jVar.Y));
                        break;
                    case 56:
                        str3 = str4;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z));
                        break;
                    case 57:
                        str3 = str4;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f27382a0));
                        break;
                    case 58:
                        str3 = str4;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f27384b0));
                        break;
                    case 59:
                        str3 = str4;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f27386c0));
                        break;
                    case 60:
                        str3 = str4;
                        obj.a(60, obtainStyledAttributes.getFloat(index2, mVar.f27436a));
                        break;
                    case 62:
                        str3 = str4;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.A));
                        break;
                    case 63:
                        str3 = str4;
                        obj.a(63, obtainStyledAttributes.getFloat(index2, jVar.B));
                        break;
                    case 64:
                        str3 = str4;
                        obj.b(64, i(obtainStyledAttributes, index2, kVar.f27422a));
                        break;
                    case 65:
                        str3 = str4;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obj.c(65, obtainStyledAttributes.getString(index2));
                            break;
                        } else {
                            obj.c(65, strArr[obtainStyledAttributes.getInteger(index2, 0)]);
                            break;
                        }
                    case 66:
                        str3 = str4;
                        obj.b(66, obtainStyledAttributes.getInt(index2, 0));
                        break;
                    case 67:
                        str3 = str4;
                        obj.a(67, obtainStyledAttributes.getFloat(index2, kVar.f27426e));
                        break;
                    case 68:
                        str3 = str4;
                        obj.a(68, obtainStyledAttributes.getFloat(index2, lVar.f27434d));
                        break;
                    case 69:
                        str3 = str4;
                        obj.a(69, obtainStyledAttributes.getFloat(index2, 1.0f));
                        break;
                    case 70:
                        str3 = str4;
                        obj.a(70, obtainStyledAttributes.getFloat(index2, 1.0f));
                        break;
                    case 71:
                        str3 = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str3 = str4;
                        obj.b(72, obtainStyledAttributes.getInt(index2, jVar.f27392f0));
                        break;
                    case 73:
                        str3 = str4;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f27394g0));
                        break;
                    case 74:
                        str3 = str4;
                        obj.c(74, obtainStyledAttributes.getString(index2));
                        break;
                    case 75:
                        str3 = str4;
                        obj.d(75, obtainStyledAttributes.getBoolean(index2, jVar.n0));
                        break;
                    case 76:
                        str3 = str4;
                        obj.b(76, obtainStyledAttributes.getInt(index2, kVar.f27424c));
                        break;
                    case 77:
                        str3 = str4;
                        obj.c(77, obtainStyledAttributes.getString(index2));
                        break;
                    case 78:
                        str3 = str4;
                        obj.b(78, obtainStyledAttributes.getInt(index2, lVar.f27432b));
                        break;
                    case 79:
                        str3 = str4;
                        obj.a(79, obtainStyledAttributes.getFloat(index2, kVar.f27425d));
                        break;
                    case 80:
                        str3 = str4;
                        obj.d(80, obtainStyledAttributes.getBoolean(index2, jVar.f27404l0));
                        break;
                    case 81:
                        str3 = str4;
                        obj.d(81, obtainStyledAttributes.getBoolean(index2, jVar.f27406m0));
                        break;
                    case 82:
                        str3 = str4;
                        obj.b(82, obtainStyledAttributes.getInteger(index2, kVar.f27423b));
                        break;
                    case 83:
                        str3 = str4;
                        obj.b(83, i(obtainStyledAttributes, index2, mVar.f27443h));
                        break;
                    case 84:
                        str3 = str4;
                        obj.b(84, obtainStyledAttributes.getInteger(index2, kVar.f27428g));
                        break;
                    case 85:
                        str3 = str4;
                        obj.a(85, obtainStyledAttributes.getFloat(index2, kVar.f27427f));
                        break;
                    case 86:
                        str3 = str4;
                        int i15 = obtainStyledAttributes.peekValue(index2).type;
                        if (i15 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index2, -1);
                            kVar.f27430i = resourceId2;
                            obj.b(89, resourceId2);
                            if (kVar.f27430i != -1) {
                                obj.b(88, -2);
                                break;
                            }
                        } else if (i15 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.f27429h = string2;
                            obj.c(90, string2);
                            if (kVar.f27429h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index2, -1);
                                kVar.f27430i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                                break;
                            } else {
                                obj.b(88, -1);
                                break;
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index2, kVar.f27430i));
                            break;
                        }
                        break;
                    case 87:
                        str3 = str4;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray2.get(index2));
                        break;
                    case 93:
                        str3 = str4;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.L));
                        break;
                    case 94:
                        str3 = str4;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index2, jVar.S));
                        break;
                    case 95:
                        str3 = str4;
                        j(obj, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        str3 = str4;
                        j(obj, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        str3 = str4;
                        obj.b(97, obtainStyledAttributes.getInt(index2, jVar.f27409o0));
                        break;
                    case 98:
                        str3 = str4;
                        int i16 = l3.a.f23934s;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            break;
                        } else {
                            iVar.f27374a = obtainStyledAttributes.getResourceId(index2, iVar.f27374a);
                            break;
                        }
                    case 99:
                        str3 = str4;
                        obj.d(99, obtainStyledAttributes.getBoolean(index2, jVar.f27393g));
                        break;
                }
                i13++;
                indexCount2 = i14;
                str4 = str3;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int i(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.n.j(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void k(d dVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i10, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > s0.g.f34069a && parseFloat2 > s0.g.f34069a) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i10);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        dVar.G = str;
    }

    public static String l(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0101. Please report as an issue. */
    public final void b(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i10;
        String str;
        int i11;
        String str2;
        n nVar = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f27454c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout2.getChildAt(i12);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb2.append(str2);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (nVar.f27453b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        i iVar = (i) hashMap.get(Integer.valueOf(id2));
                        if (iVar != null) {
                            if (childAt instanceof Barrier) {
                                j jVar = iVar.f27377d;
                                jVar.f27396h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(jVar.f27392f0);
                                barrier.setMargin(jVar.f27394g0);
                                barrier.setAllowsGoneWidget(jVar.n0);
                                int[] iArr = jVar.f27398i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f27400j0;
                                    if (str3 != null) {
                                        int[] e10 = e(barrier, str3);
                                        jVar.f27398i0 = e10;
                                        barrier.setReferencedIds(e10);
                                    }
                                }
                            }
                            d dVar = (d) childAt.getLayoutParams();
                            dVar.a();
                            iVar.a(dVar);
                            HashMap hashMap2 = iVar.f27379f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap2.keySet()) {
                                a aVar = (a) hashMap2.get(str4);
                                if (!aVar.f27291a) {
                                    str = a3.a.f("set", str4);
                                } else {
                                    str = str4;
                                }
                                HashMap hashMap3 = hashMap2;
                                try {
                                    switch (w.k.e(aVar.f27292b)) {
                                        case 0:
                                            i11 = childCount;
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(str, clsArr).invoke(childAt, Integer.valueOf(aVar.f27293c));
                                            } catch (IllegalAccessException e11) {
                                                e = e11;
                                                StringBuilder s7 = da.e.s(" Custom Attribute \"", str4, "\" not found on ");
                                                s7.append(cls.getName());
                                                Log.e("TransitionLayout", s7.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                childCount = i11;
                                            } catch (NoSuchMethodException e12) {
                                                e = e12;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap2 = hashMap3;
                                                childCount = i11;
                                            } catch (InvocationTargetException e13) {
                                                e = e13;
                                                StringBuilder s10 = da.e.s(" Custom Attribute \"", str4, "\" not found on ");
                                                s10.append(cls.getName());
                                                Log.e("TransitionLayout", s10.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                childCount = i11;
                                            }
                                        case 1:
                                            i11 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f27294d));
                                            break;
                                        case 2:
                                            i11 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f27297g));
                                            break;
                                        case 3:
                                            i11 = childCount;
                                            Method method = cls.getMethod(str, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(aVar.f27297g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i11 = childCount;
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, aVar.f27295e);
                                            break;
                                        case 5:
                                            i11 = childCount;
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f27296f));
                                            break;
                                        case 6:
                                            i11 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f27294d));
                                            break;
                                        case 7:
                                            i11 = childCount;
                                            try {
                                                cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f27293c));
                                            } catch (IllegalAccessException e14) {
                                                e = e14;
                                                StringBuilder s72 = da.e.s(" Custom Attribute \"", str4, "\" not found on ");
                                                s72.append(cls.getName());
                                                Log.e("TransitionLayout", s72.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                childCount = i11;
                                            } catch (NoSuchMethodException e15) {
                                                e = e15;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap2 = hashMap3;
                                                childCount = i11;
                                            } catch (InvocationTargetException e16) {
                                                e = e16;
                                                StringBuilder s102 = da.e.s(" Custom Attribute \"", str4, "\" not found on ");
                                                s102.append(cls.getName());
                                                Log.e("TransitionLayout", s102.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                childCount = i11;
                                            }
                                        default:
                                            i11 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e17) {
                                    e = e17;
                                    i11 = childCount;
                                } catch (NoSuchMethodException e18) {
                                    e = e18;
                                    i11 = childCount;
                                } catch (InvocationTargetException e19) {
                                    e = e19;
                                    i11 = childCount;
                                }
                                hashMap2 = hashMap3;
                                childCount = i11;
                            }
                            i10 = childCount;
                            childAt.setLayoutParams(dVar);
                            l lVar = iVar.f27375b;
                            if (lVar.f27432b == 0) {
                                childAt.setVisibility(lVar.f27431a);
                            }
                            childAt.setAlpha(lVar.f27433c);
                            m mVar = iVar.f27378e;
                            childAt.setRotation(mVar.f27436a);
                            childAt.setRotationX(mVar.f27437b);
                            childAt.setRotationY(mVar.f27438c);
                            childAt.setScaleX(mVar.f27439d);
                            childAt.setScaleY(mVar.f27440e);
                            if (mVar.f27443h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f27443h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f27441f)) {
                                    childAt.setPivotX(mVar.f27441f);
                                }
                                if (!Float.isNaN(mVar.f27442g)) {
                                    childAt.setPivotY(mVar.f27442g);
                                }
                            }
                            childAt.setTranslationX(mVar.f27444i);
                            childAt.setTranslationY(mVar.f27445j);
                            childAt.setTranslationZ(mVar.f27446k);
                            if (mVar.f27447l) {
                                childAt.setElevation(mVar.f27448m);
                            }
                        }
                    } else {
                        i10 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                    i12++;
                    nVar = this;
                    constraintLayout2 = constraintLayout;
                    childCount = i10;
                }
            }
            i10 = childCount;
            i12++;
            nVar = this;
            constraintLayout2 = constraintLayout;
            childCount = i10;
        }
        int i13 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f27377d;
                if (jVar2.f27396h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = jVar2.f27398i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f27400j0;
                        if (str5 != null) {
                            int[] e20 = e(barrier2, str5);
                            jVar2.f27398i0 = e20;
                            barrier2.setReferencedIds(e20);
                        }
                    }
                    barrier2.setType(jVar2.f27392f0);
                    barrier2.setMargin(jVar2.f27394g0);
                    d a10 = ConstraintLayout.a();
                    barrier2.k();
                    iVar2.a(a10);
                    viewGroup = constraintLayout;
                    viewGroup.addView(barrier2, a10);
                } else {
                    viewGroup = constraintLayout;
                }
                if (jVar2.f27381a) {
                    p pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    d a11 = ConstraintLayout.a();
                    iVar2.a(a11);
                    viewGroup.addView(pVar, a11);
                }
            }
        }
        for (int i14 = 0; i14 < i13; i14++) {
            View childAt2 = constraintLayout.getChildAt(i14);
            if (childAt2 instanceof b) {
                ((b) childAt2).f(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f27454c;
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            d dVar = (d) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (nVar.f27453b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new i());
            }
            i iVar = (i) hashMap.get(Integer.valueOf(id2));
            if (iVar == null) {
                i10 = childCount;
            } else {
                HashMap hashMap2 = nVar.f27452a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    a aVar = (a) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i11 = childCount;
                        } else {
                            i11 = childCount;
                            try {
                                hashMap3.put(str, new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                e.printStackTrace();
                                childCount = i11;
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                e.printStackTrace();
                                childCount = i11;
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                e.printStackTrace();
                                childCount = i11;
                            }
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        i11 = childCount;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        i11 = childCount;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        i11 = childCount;
                    }
                    childCount = i11;
                }
                i10 = childCount;
                iVar.f27379f = hashMap3;
                iVar.f27374a = id2;
                int i13 = dVar.f27314e;
                j jVar = iVar.f27377d;
                jVar.f27395h = i13;
                jVar.f27397i = dVar.f27316f;
                jVar.f27399j = dVar.f27318g;
                jVar.f27401k = dVar.f27320h;
                jVar.f27403l = dVar.f27322i;
                jVar.f27405m = dVar.f27324j;
                jVar.f27407n = dVar.f27326k;
                jVar.f27408o = dVar.f27328l;
                jVar.f27410p = dVar.f27330m;
                jVar.f27411q = dVar.f27332n;
                jVar.f27412r = dVar.f27333o;
                jVar.f27413s = dVar.f27339s;
                jVar.f27414t = dVar.f27340t;
                jVar.f27415u = dVar.f27341u;
                jVar.f27416v = dVar.f27342v;
                jVar.f27417w = dVar.E;
                jVar.f27418x = dVar.F;
                jVar.f27419y = dVar.G;
                jVar.f27420z = dVar.f27335p;
                jVar.A = dVar.f27337q;
                jVar.B = dVar.f27338r;
                jVar.C = dVar.T;
                jVar.D = dVar.U;
                jVar.E = dVar.V;
                jVar.f27391f = dVar.f27310c;
                jVar.f27387d = dVar.f27306a;
                jVar.f27389e = dVar.f27308b;
                jVar.f27383b = ((ViewGroup.MarginLayoutParams) dVar).width;
                jVar.f27385c = ((ViewGroup.MarginLayoutParams) dVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                jVar.I = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                jVar.L = dVar.D;
                jVar.T = dVar.I;
                jVar.U = dVar.H;
                jVar.W = dVar.K;
                jVar.V = dVar.J;
                jVar.f27404l0 = dVar.W;
                jVar.f27406m0 = dVar.X;
                jVar.X = dVar.L;
                jVar.Y = dVar.M;
                jVar.Z = dVar.P;
                jVar.f27382a0 = dVar.Q;
                jVar.f27384b0 = dVar.N;
                jVar.f27386c0 = dVar.O;
                jVar.f27388d0 = dVar.R;
                jVar.f27390e0 = dVar.S;
                jVar.f27402k0 = dVar.Y;
                jVar.N = dVar.f27344x;
                jVar.P = dVar.f27346z;
                jVar.M = dVar.f27343w;
                jVar.O = dVar.f27345y;
                jVar.R = dVar.A;
                jVar.Q = dVar.B;
                jVar.S = dVar.C;
                jVar.f27409o0 = dVar.Z;
                jVar.J = dVar.getMarginEnd();
                jVar.K = dVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f27375b;
                lVar.f27431a = visibility;
                lVar.f27433c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f27378e;
                mVar.f27436a = rotation;
                mVar.f27437b = childAt.getRotationX();
                mVar.f27438c = childAt.getRotationY();
                mVar.f27439d = childAt.getScaleX();
                mVar.f27440e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f27441f = pivotX;
                    mVar.f27442g = pivotY;
                }
                mVar.f27444i = childAt.getTranslationX();
                mVar.f27445j = childAt.getTranslationY();
                mVar.f27446k = childAt.getTranslationZ();
                if (mVar.f27447l) {
                    mVar.f27448m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    jVar.n0 = barrier.getAllowsGoneWidget();
                    jVar.f27398i0 = barrier.getReferencedIds();
                    jVar.f27392f0 = barrier.getType();
                    jVar.f27394g0 = barrier.getMargin();
                }
            }
            i12++;
            nVar = this;
            childCount = i10;
        }
    }

    public final void d(int i10, int i11, int i12, int i13, int i14) {
        HashMap hashMap = this.f27454c;
        if (!hashMap.containsKey(Integer.valueOf(i10))) {
            hashMap.put(Integer.valueOf(i10), new i());
        }
        i iVar = (i) hashMap.get(Integer.valueOf(i10));
        if (iVar == null) {
            return;
        }
        j jVar = iVar.f27377d;
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    jVar.f27395h = i12;
                    jVar.f27397i = -1;
                } else if (i13 == 2) {
                    jVar.f27397i = i12;
                    jVar.f27395h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + l(i13) + " undefined");
                }
                jVar.F = i14;
                return;
            case 2:
                if (i13 == 1) {
                    jVar.f27399j = i12;
                    jVar.f27401k = -1;
                } else if (i13 == 2) {
                    jVar.f27401k = i12;
                    jVar.f27399j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + l(i13) + " undefined");
                }
                jVar.G = i14;
                return;
            case 3:
                if (i13 == 3) {
                    jVar.f27403l = i12;
                    jVar.f27405m = -1;
                    jVar.f27410p = -1;
                    jVar.f27411q = -1;
                    jVar.f27412r = -1;
                } else if (i13 == 4) {
                    jVar.f27405m = i12;
                    jVar.f27403l = -1;
                    jVar.f27410p = -1;
                    jVar.f27411q = -1;
                    jVar.f27412r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + l(i13) + " undefined");
                }
                jVar.H = i14;
                return;
            case 4:
                if (i13 == 4) {
                    jVar.f27408o = i12;
                    jVar.f27407n = -1;
                    jVar.f27410p = -1;
                    jVar.f27411q = -1;
                    jVar.f27412r = -1;
                } else if (i13 == 3) {
                    jVar.f27407n = i12;
                    jVar.f27408o = -1;
                    jVar.f27410p = -1;
                    jVar.f27411q = -1;
                    jVar.f27412r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + l(i13) + " undefined");
                }
                jVar.I = i14;
                return;
            case 5:
                if (i13 == 5) {
                    jVar.f27410p = i12;
                    jVar.f27408o = -1;
                    jVar.f27407n = -1;
                    jVar.f27403l = -1;
                    jVar.f27405m = -1;
                    return;
                }
                if (i13 == 3) {
                    jVar.f27411q = i12;
                    jVar.f27408o = -1;
                    jVar.f27407n = -1;
                    jVar.f27403l = -1;
                    jVar.f27405m = -1;
                    return;
                }
                if (i13 == 4) {
                    jVar.f27412r = i12;
                    jVar.f27408o = -1;
                    jVar.f27407n = -1;
                    jVar.f27403l = -1;
                    jVar.f27405m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + l(i13) + " undefined");
            case 6:
                if (i13 == 6) {
                    jVar.f27414t = i12;
                    jVar.f27413s = -1;
                } else if (i13 == 7) {
                    jVar.f27413s = i12;
                    jVar.f27414t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + l(i13) + " undefined");
                }
                jVar.K = i14;
                return;
            case 7:
                if (i13 == 7) {
                    jVar.f27416v = i12;
                    jVar.f27415u = -1;
                } else if (i13 == 6) {
                    jVar.f27415u = i12;
                    jVar.f27416v = -1;
                } else {
                    throw new IllegalArgumentException("right to " + l(i13) + " undefined");
                }
                jVar.J = i14;
                return;
            default:
                throw new IllegalArgumentException(l(i11) + " to " + l(i13) + " unknown");
        }
    }

    public final i g(int i10) {
        HashMap hashMap = this.f27454c;
        if (!hashMap.containsKey(Integer.valueOf(i10))) {
            hashMap.put(Integer.valueOf(i10), new i());
        }
        return (i) hashMap.get(Integer.valueOf(i10));
    }

    public final void h(int i10, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        i f10 = f(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            f10.f27377d.f27381a = true;
                        }
                        this.f27454c.put(Integer.valueOf(f10.f27374a), f10);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
