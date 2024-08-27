package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: p0, reason: collision with root package name */
    public static final SparseIntArray f27380p0;
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f27381a;

    /* renamed from: a0, reason: collision with root package name */
    public int f27382a0;

    /* renamed from: b, reason: collision with root package name */
    public int f27383b;

    /* renamed from: b0, reason: collision with root package name */
    public int f27384b0;

    /* renamed from: c, reason: collision with root package name */
    public int f27385c;

    /* renamed from: c0, reason: collision with root package name */
    public int f27386c0;

    /* renamed from: d, reason: collision with root package name */
    public int f27387d;

    /* renamed from: d0, reason: collision with root package name */
    public float f27388d0;

    /* renamed from: e, reason: collision with root package name */
    public int f27389e;

    /* renamed from: e0, reason: collision with root package name */
    public float f27390e0;

    /* renamed from: f, reason: collision with root package name */
    public float f27391f;

    /* renamed from: f0, reason: collision with root package name */
    public int f27392f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27393g;

    /* renamed from: g0, reason: collision with root package name */
    public int f27394g0;

    /* renamed from: h, reason: collision with root package name */
    public int f27395h;

    /* renamed from: h0, reason: collision with root package name */
    public int f27396h0;

    /* renamed from: i, reason: collision with root package name */
    public int f27397i;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f27398i0;

    /* renamed from: j, reason: collision with root package name */
    public int f27399j;

    /* renamed from: j0, reason: collision with root package name */
    public String f27400j0;

    /* renamed from: k, reason: collision with root package name */
    public int f27401k;

    /* renamed from: k0, reason: collision with root package name */
    public String f27402k0;

    /* renamed from: l, reason: collision with root package name */
    public int f27403l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f27404l0;

    /* renamed from: m, reason: collision with root package name */
    public int f27405m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f27406m0;

    /* renamed from: n, reason: collision with root package name */
    public int f27407n;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public int f27408o;

    /* renamed from: o0, reason: collision with root package name */
    public int f27409o0;

    /* renamed from: p, reason: collision with root package name */
    public int f27410p;

    /* renamed from: q, reason: collision with root package name */
    public int f27411q;

    /* renamed from: r, reason: collision with root package name */
    public int f27412r;

    /* renamed from: s, reason: collision with root package name */
    public int f27413s;

    /* renamed from: t, reason: collision with root package name */
    public int f27414t;

    /* renamed from: u, reason: collision with root package name */
    public int f27415u;

    /* renamed from: v, reason: collision with root package name */
    public int f27416v;

    /* renamed from: w, reason: collision with root package name */
    public float f27417w;

    /* renamed from: x, reason: collision with root package name */
    public float f27418x;

    /* renamed from: y, reason: collision with root package name */
    public String f27419y;

    /* renamed from: z, reason: collision with root package name */
    public int f27420z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27380p0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 41);
        sparseIntArray.append(16, 42);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f27460e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray = f27380p0;
            int i11 = sparseIntArray.get(index);
            switch (i11) {
                case 1:
                    this.f27410p = n.i(obtainStyledAttributes, index, this.f27410p);
                    break;
                case 2:
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 3:
                    this.f27408o = n.i(obtainStyledAttributes, index, this.f27408o);
                    break;
                case 4:
                    this.f27407n = n.i(obtainStyledAttributes, index, this.f27407n);
                    break;
                case 5:
                    this.f27419y = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                    break;
                case 7:
                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 8:
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 9:
                    this.f27416v = n.i(obtainStyledAttributes, index, this.f27416v);
                    break;
                case 10:
                    this.f27415u = n.i(obtainStyledAttributes, index, this.f27415u);
                    break;
                case 11:
                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 12:
                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 13:
                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                    break;
                case 14:
                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 15:
                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 16:
                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 17:
                    this.f27387d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f27387d);
                    break;
                case 18:
                    this.f27389e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f27389e);
                    break;
                case 19:
                    this.f27391f = obtainStyledAttributes.getFloat(index, this.f27391f);
                    break;
                case 20:
                    this.f27417w = obtainStyledAttributes.getFloat(index, this.f27417w);
                    break;
                case 21:
                    this.f27385c = obtainStyledAttributes.getLayoutDimension(index, this.f27385c);
                    break;
                case 22:
                    this.f27383b = obtainStyledAttributes.getLayoutDimension(index, this.f27383b);
                    break;
                case 23:
                    this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                    break;
                case 24:
                    this.f27395h = n.i(obtainStyledAttributes, index, this.f27395h);
                    break;
                case 25:
                    this.f27397i = n.i(obtainStyledAttributes, index, this.f27397i);
                    break;
                case 26:
                    this.E = obtainStyledAttributes.getInt(index, this.E);
                    break;
                case 27:
                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 28:
                    this.f27399j = n.i(obtainStyledAttributes, index, this.f27399j);
                    break;
                case 29:
                    this.f27401k = n.i(obtainStyledAttributes, index, this.f27401k);
                    break;
                case 30:
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 31:
                    this.f27413s = n.i(obtainStyledAttributes, index, this.f27413s);
                    break;
                case 32:
                    this.f27414t = n.i(obtainStyledAttributes, index, this.f27414t);
                    break;
                case 33:
                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case 34:
                    this.f27405m = n.i(obtainStyledAttributes, index, this.f27405m);
                    break;
                case 35:
                    this.f27403l = n.i(obtainStyledAttributes, index, this.f27403l);
                    break;
                case 36:
                    this.f27418x = obtainStyledAttributes.getFloat(index, this.f27418x);
                    break;
                case 37:
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                    break;
                case 38:
                    this.T = obtainStyledAttributes.getFloat(index, this.T);
                    break;
                case 39:
                    this.V = obtainStyledAttributes.getInt(index, this.V);
                    break;
                case 40:
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                    break;
                case 41:
                    n.j(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    n.j(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i11) {
                        case 61:
                            this.f27420z = n.i(obtainStyledAttributes, index, this.f27420z);
                            break;
                        case 62:
                            this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                            break;
                        case 63:
                            this.B = obtainStyledAttributes.getFloat(index, this.B);
                            break;
                        default:
                            switch (i11) {
                                case 69:
                                    this.f27388d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f27390e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.f27392f0 = obtainStyledAttributes.getInt(index, this.f27392f0);
                                    break;
                                case 73:
                                    this.f27394g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f27394g0);
                                    break;
                                case 74:
                                    this.f27400j0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                    break;
                                case 76:
                                    this.f27409o0 = obtainStyledAttributes.getInt(index, this.f27409o0);
                                    break;
                                case 77:
                                    this.f27411q = n.i(obtainStyledAttributes, index, this.f27411q);
                                    break;
                                case 78:
                                    this.f27412r = n.i(obtainStyledAttributes, index, this.f27412r);
                                    break;
                                case 79:
                                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    break;
                                case 80:
                                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                    break;
                                case 81:
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    break;
                                case 82:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 83:
                                    this.f27382a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f27382a0);
                                    break;
                                case 84:
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                case 85:
                                    this.f27386c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f27386c0);
                                    break;
                                case 86:
                                    this.f27384b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f27384b0);
                                    break;
                                case 87:
                                    this.f27404l0 = obtainStyledAttributes.getBoolean(index, this.f27404l0);
                                    break;
                                case 88:
                                    this.f27406m0 = obtainStyledAttributes.getBoolean(index, this.f27406m0);
                                    break;
                                case 89:
                                    this.f27402k0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f27393g = obtainStyledAttributes.getBoolean(index, this.f27393g);
                                    break;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
