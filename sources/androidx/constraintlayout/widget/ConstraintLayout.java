package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import e.j;
import j3.e;
import j3.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m3.b;
import m3.c;
import m3.d;
import m3.f;
import m3.g;
import m3.n;
import m3.o;
import m3.p;
import m3.r;
import m3.s;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1448r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1449a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1450b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1451c;

    /* renamed from: d, reason: collision with root package name */
    public int f1452d;

    /* renamed from: e, reason: collision with root package name */
    public int f1453e;

    /* renamed from: f, reason: collision with root package name */
    public int f1454f;

    /* renamed from: g, reason: collision with root package name */
    public int f1455g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1456h;

    /* renamed from: i, reason: collision with root package name */
    public int f1457i;

    /* renamed from: j, reason: collision with root package name */
    public n f1458j;

    /* renamed from: k, reason: collision with root package name */
    public g f1459k;

    /* renamed from: l, reason: collision with root package name */
    public int f1460l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1461m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1462n;

    /* renamed from: o, reason: collision with root package name */
    public final m3.e f1463o;

    /* renamed from: p, reason: collision with root package name */
    public int f1464p;

    /* renamed from: q, reason: collision with root package name */
    public int f1465q;

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1449a = new SparseArray();
        this.f1450b = new ArrayList(4);
        this.f1451c = new e();
        this.f1452d = 0;
        this.f1453e = 0;
        this.f1454f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1455g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1456h = true;
        this.f1457i = 257;
        this.f1458j = null;
        this.f1459k = null;
        this.f1460l = -1;
        this.f1461m = new HashMap();
        this.f1462n = new SparseArray();
        this.f1463o = new m3.e(this, this);
        this.f1464p = 0;
        this.f1465q = 0;
        i(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, m3.d] */
    public static d a() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f27306a = -1;
        marginLayoutParams.f27308b = -1;
        marginLayoutParams.f27310c = -1.0f;
        marginLayoutParams.f27312d = true;
        marginLayoutParams.f27314e = -1;
        marginLayoutParams.f27316f = -1;
        marginLayoutParams.f27318g = -1;
        marginLayoutParams.f27320h = -1;
        marginLayoutParams.f27322i = -1;
        marginLayoutParams.f27324j = -1;
        marginLayoutParams.f27326k = -1;
        marginLayoutParams.f27328l = -1;
        marginLayoutParams.f27330m = -1;
        marginLayoutParams.f27332n = -1;
        marginLayoutParams.f27333o = -1;
        marginLayoutParams.f27335p = -1;
        marginLayoutParams.f27337q = 0;
        marginLayoutParams.f27338r = s0.g.f34069a;
        marginLayoutParams.f27339s = -1;
        marginLayoutParams.f27340t = -1;
        marginLayoutParams.f27341u = -1;
        marginLayoutParams.f27342v = -1;
        marginLayoutParams.f27343w = Integer.MIN_VALUE;
        marginLayoutParams.f27344x = Integer.MIN_VALUE;
        marginLayoutParams.f27345y = Integer.MIN_VALUE;
        marginLayoutParams.f27346z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f27307a0 = true;
        marginLayoutParams.f27309b0 = true;
        marginLayoutParams.f27311c0 = false;
        marginLayoutParams.f27313d0 = false;
        marginLayoutParams.f27315e0 = false;
        marginLayoutParams.f27317f0 = -1;
        marginLayoutParams.f27319g0 = -1;
        marginLayoutParams.f27321h0 = -1;
        marginLayoutParams.f27323i0 = -1;
        marginLayoutParams.f27325j0 = Integer.MIN_VALUE;
        marginLayoutParams.f27327k0 = Integer.MIN_VALUE;
        marginLayoutParams.f27329l0 = 0.5f;
        marginLayoutParams.f27336p0 = new j3.d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m3.s, java.lang.Object] */
    public static s getSharedValues() {
        if (f1448r == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            f1448r = obj;
        }
        return f1448r;
    }

    public final j3.d b(View view) {
        if (view == this) {
            return this.f1451c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof d) {
                return ((d) view.getLayoutParams()).f27336p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof d) {
                return ((d) view.getLayoutParams()).f27336p0;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1450b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((b) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1456h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, m3.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f27306a = -1;
        marginLayoutParams.f27308b = -1;
        marginLayoutParams.f27310c = -1.0f;
        marginLayoutParams.f27312d = true;
        marginLayoutParams.f27314e = -1;
        marginLayoutParams.f27316f = -1;
        marginLayoutParams.f27318g = -1;
        marginLayoutParams.f27320h = -1;
        marginLayoutParams.f27322i = -1;
        marginLayoutParams.f27324j = -1;
        marginLayoutParams.f27326k = -1;
        marginLayoutParams.f27328l = -1;
        marginLayoutParams.f27330m = -1;
        marginLayoutParams.f27332n = -1;
        marginLayoutParams.f27333o = -1;
        marginLayoutParams.f27335p = -1;
        marginLayoutParams.f27337q = 0;
        marginLayoutParams.f27338r = s0.g.f34069a;
        marginLayoutParams.f27339s = -1;
        marginLayoutParams.f27340t = -1;
        marginLayoutParams.f27341u = -1;
        marginLayoutParams.f27342v = -1;
        marginLayoutParams.f27343w = Integer.MIN_VALUE;
        marginLayoutParams.f27344x = Integer.MIN_VALUE;
        marginLayoutParams.f27345y = Integer.MIN_VALUE;
        marginLayoutParams.f27346z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f27307a0 = true;
        marginLayoutParams.f27309b0 = true;
        marginLayoutParams.f27311c0 = false;
        marginLayoutParams.f27313d0 = false;
        marginLayoutParams.f27315e0 = false;
        marginLayoutParams.f27317f0 = -1;
        marginLayoutParams.f27319g0 = -1;
        marginLayoutParams.f27321h0 = -1;
        marginLayoutParams.f27323i0 = -1;
        marginLayoutParams.f27325j0 = Integer.MIN_VALUE;
        marginLayoutParams.f27327k0 = Integer.MIN_VALUE;
        marginLayoutParams.f27329l0 = 0.5f;
        marginLayoutParams.f27336p0 = new j3.d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f27457b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = c.f27305a.get(index);
            switch (i11) {
                case 1:
                    marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27335p);
                    marginLayoutParams.f27335p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f27335p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f27337q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f27337q);
                    break;
                case 4:
                    float f10 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f27338r) % 360.0f;
                    marginLayoutParams.f27338r = f10;
                    if (f10 < s0.g.f34069a) {
                        marginLayoutParams.f27338r = (360.0f - f10) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f27306a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f27306a);
                    break;
                case 6:
                    marginLayoutParams.f27308b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f27308b);
                    break;
                case 7:
                    marginLayoutParams.f27310c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f27310c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27314e);
                    marginLayoutParams.f27314e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f27314e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27316f);
                    marginLayoutParams.f27316f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f27316f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27318g);
                    marginLayoutParams.f27318g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f27318g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27320h);
                    marginLayoutParams.f27320h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f27320h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27322i);
                    marginLayoutParams.f27322i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f27322i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27324j);
                    marginLayoutParams.f27324j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f27324j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27326k);
                    marginLayoutParams.f27326k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f27326k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27328l);
                    marginLayoutParams.f27328l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f27328l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27330m);
                    marginLayoutParams.f27330m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f27330m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27339s);
                    marginLayoutParams.f27339s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f27339s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27340t);
                    marginLayoutParams.f27340t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f27340t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27341u);
                    marginLayoutParams.f27341u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f27341u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27342v);
                    marginLayoutParams.f27342v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f27342v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f27343w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f27343w);
                    break;
                case 22:
                    marginLayoutParams.f27344x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f27344x);
                    break;
                case 23:
                    marginLayoutParams.f27345y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f27345y);
                    break;
                case 24:
                    marginLayoutParams.f27346z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f27346z);
                    break;
                case 25:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case 26:
                    marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);
                    break;
                case 27:
                    marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);
                    break;
                case 28:
                    marginLayoutParams.X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.X);
                    break;
                case 29:
                    marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);
                    break;
                case 30:
                    marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);
                    break;
                case 31:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i13 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.M = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) == -2) {
                            marginLayoutParams.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) == -2) {
                            marginLayoutParams.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.R = Math.max(s0.g.f34069a, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
                    marginLayoutParams.L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) == -2) {
                            marginLayoutParams.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Q) == -2) {
                            marginLayoutParams.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.S = Math.max(s0.g.f34069a, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i11) {
                        case 44:
                            n.k(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);
                            break;
                        case 46:
                            marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);
                            break;
                        case 47:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);
                            break;
                        case 50:
                            marginLayoutParams.U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.U);
                            break;
                        case 51:
                            marginLayoutParams.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27332n);
                            marginLayoutParams.f27332n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.f27332n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f27333o);
                            marginLayoutParams.f27333o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.f27333o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.D);
                            break;
                        case 55:
                            marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);
                            break;
                        default:
                            switch (i11) {
                                case 64:
                                    n.j(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.j(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    break;
                                case 67:
                                    marginLayoutParams.f27312d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f27312d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f1455g;
    }

    public int getMaxWidth() {
        return this.f1454f;
    }

    public int getMinHeight() {
        return this.f1453e;
    }

    public int getMinWidth() {
        return this.f1452d;
    }

    public int getOptimizationLevel() {
        return this.f1451c.F0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f1451c;
        if (eVar.f20870l == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.f20870l = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.f20870l = "parent";
            }
        }
        if (eVar.f20867j0 == null) {
            eVar.f20867j0 = eVar.f20870l;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f20867j0);
        }
        Iterator it = eVar.f20935s0.iterator();
        while (it.hasNext()) {
            j3.d dVar = (j3.d) it.next();
            View view = (View) dVar.f20863h0;
            if (view != null) {
                if (dVar.f20870l == null && (id2 = view.getId()) != -1) {
                    dVar.f20870l = getContext().getResources().getResourceEntryName(id2);
                }
                if (dVar.f20867j0 == null) {
                    dVar.f20867j0 = dVar.f20870l;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f20867j0);
                }
            }
        }
        eVar.p(sb2);
        return sb2.toString();
    }

    public final void i(AttributeSet attributeSet, int i10) {
        e eVar = this.f1451c;
        eVar.f20863h0 = this;
        m3.e eVar2 = this.f1463o;
        eVar.f20894w0 = eVar2;
        eVar.f20892u0.f21997h = eVar2;
        this.f1449a.put(getId(), this);
        this.f1458j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f27457b, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f1452d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1452d);
                } else if (index == 17) {
                    this.f1453e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1453e);
                } else if (index == 14) {
                    this.f1454f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1454f);
                } else if (index == 15) {
                    this.f1455g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1455g);
                } else if (index == 113) {
                    this.f1457i = obtainStyledAttributes.getInt(index, this.f1457i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1459k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1458j = nVar;
                        nVar.h(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.f1458j = null;
                    }
                    this.f1460l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.F0 = this.f1457i;
        c3.d.f7904q = eVar.d0(512);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m3.g] */
    public final void j(int i10) {
        int eventType;
        j jVar;
        Context context = getContext();
        ?? obj = new Object();
        obj.f27360a = new SparseArray();
        obj.f27361b = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            eventType = xml.getEventType();
            jVar = null;
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        while (true) {
            char c10 = 1;
            if (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    break;
                                }
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                        }
                        c10 = 65535;
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 == 4) {
                                    obj.a(context, xml);
                                }
                            } else {
                                f fVar = new f(context, xml);
                                if (jVar != null) {
                                    ((ArrayList) jVar.f14634c).add(fVar);
                                }
                            }
                        } else {
                            jVar = new j(context, xml);
                            obj.f27360a.put(jVar.f14632a, jVar);
                        }
                    }
                } else {
                    xml.getName();
                }
                eventType = xml.next();
            } else {
                this.f1459k = obj;
                return;
            }
        }
    }

    public final void k(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f1461m == null) {
                this.f1461m = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1461m.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void l(j3.d dVar, d dVar2, SparseArray sparseArray, int i10, int i11) {
        View view = (View) this.f1449a.get(i10);
        j3.d dVar3 = (j3.d) sparseArray.get(i10);
        if (dVar3 != null && view != null && (view.getLayoutParams() instanceof d)) {
            dVar2.f27311c0 = true;
            if (i11 == 6) {
                d dVar4 = (d) view.getLayoutParams();
                dVar4.f27311c0 = true;
                dVar4.f27336p0.G = true;
            }
            dVar.k(6).b(dVar3.k(i11), dVar2.D, dVar2.C, true);
            dVar.G = true;
            dVar.k(3).j();
            dVar.k(5).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            d dVar = (d) childAt.getLayoutParams();
            j3.d dVar2 = dVar.f27336p0;
            if (childAt.getVisibility() != 8 || dVar.f27313d0 || dVar.f27315e0 || isInEditMode) {
                int t10 = dVar2.t();
                int u10 = dVar2.u();
                childAt.layout(t10, u10, dVar2.s() + t10, dVar2.m() + u10);
            }
        }
        ArrayList arrayList = this.f1450b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((b) arrayList.get(i15)).j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0550  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        j3.d b10 = b(view);
        if ((view instanceof p) && !(b10 instanceof h)) {
            d dVar = (d) view.getLayoutParams();
            h hVar = new h();
            dVar.f27336p0 = hVar;
            dVar.f27313d0 = true;
            hVar.X(dVar.V);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.k();
            ((d) view.getLayoutParams()).f27315e0 = true;
            ArrayList arrayList = this.f1450b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f1449a.put(view.getId(), view);
        this.f1456h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1449a.remove(view.getId());
        j3.d b10 = b(view);
        this.f1451c.f20935s0.remove(b10);
        b10.E();
        this.f1450b.remove(view);
        this.f1456h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1456h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1458j = nVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray sparseArray = this.f1449a;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1455g) {
            return;
        }
        this.f1455g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1454f) {
            return;
        }
        this.f1454f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1453e) {
            return;
        }
        this.f1453e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1452d) {
            return;
        }
        this.f1452d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        g gVar = this.f1459k;
        if (gVar != null) {
            gVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1457i = i10;
        e eVar = this.f1451c;
        eVar.F0 = i10;
        c3.d.f7904q = eVar.d0(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1449a = new SparseArray();
        this.f1450b = new ArrayList(4);
        this.f1451c = new e();
        this.f1452d = 0;
        this.f1453e = 0;
        this.f1454f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1455g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1456h = true;
        this.f1457i = 257;
        this.f1458j = null;
        this.f1459k = null;
        this.f1460l = -1;
        this.f1461m = new HashMap();
        this.f1462n = new SparseArray();
        this.f1463o = new m3.e(this, this);
        this.f1464p = 0;
        this.f1465q = 0;
        i(attributeSet, i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, m3.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f27306a = -1;
        marginLayoutParams.f27308b = -1;
        marginLayoutParams.f27310c = -1.0f;
        marginLayoutParams.f27312d = true;
        marginLayoutParams.f27314e = -1;
        marginLayoutParams.f27316f = -1;
        marginLayoutParams.f27318g = -1;
        marginLayoutParams.f27320h = -1;
        marginLayoutParams.f27322i = -1;
        marginLayoutParams.f27324j = -1;
        marginLayoutParams.f27326k = -1;
        marginLayoutParams.f27328l = -1;
        marginLayoutParams.f27330m = -1;
        marginLayoutParams.f27332n = -1;
        marginLayoutParams.f27333o = -1;
        marginLayoutParams.f27335p = -1;
        marginLayoutParams.f27337q = 0;
        marginLayoutParams.f27338r = s0.g.f34069a;
        marginLayoutParams.f27339s = -1;
        marginLayoutParams.f27340t = -1;
        marginLayoutParams.f27341u = -1;
        marginLayoutParams.f27342v = -1;
        marginLayoutParams.f27343w = Integer.MIN_VALUE;
        marginLayoutParams.f27344x = Integer.MIN_VALUE;
        marginLayoutParams.f27345y = Integer.MIN_VALUE;
        marginLayoutParams.f27346z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f27307a0 = true;
        marginLayoutParams.f27309b0 = true;
        marginLayoutParams.f27311c0 = false;
        marginLayoutParams.f27313d0 = false;
        marginLayoutParams.f27315e0 = false;
        marginLayoutParams.f27317f0 = -1;
        marginLayoutParams.f27319g0 = -1;
        marginLayoutParams.f27321h0 = -1;
        marginLayoutParams.f27323i0 = -1;
        marginLayoutParams.f27325j0 = Integer.MIN_VALUE;
        marginLayoutParams.f27327k0 = Integer.MIN_VALUE;
        marginLayoutParams.f27329l0 = 0.5f;
        marginLayoutParams.f27336p0 = new j3.d();
        return marginLayoutParams;
    }
}
