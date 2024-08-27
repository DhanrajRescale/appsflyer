package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25499a;

    /* renamed from: b, reason: collision with root package name */
    public int f25500b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25501c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f25502d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25503e;

    /* renamed from: f, reason: collision with root package name */
    public Object f25504f;

    public c0(ImageView imageView) {
        this.f25499a = 0;
        this.f25500b = 0;
        this.f25501c = imageView;
    }

    public static int a(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    public static void b(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z10 = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z10 = true;
        }
        e5.a.g(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, z10);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        e5.a.f();
    }

    public static void d(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }
    }

    public final void c() {
        Drawable drawable = ((ImageView) this.f25501c).getDrawable();
        if (drawable != null) {
            q1.a(drawable);
        }
        if (drawable != null) {
            if (((o3) this.f25502d) != null) {
                if (((o3) this.f25504f) == null) {
                    this.f25504f = new o3(0);
                }
                o3 o3Var = (o3) this.f25504f;
                o3Var.f25672d = null;
                o3Var.f25671c = false;
                o3Var.f25673e = null;
                o3Var.f25670b = false;
                ColorStateList a10 = h4.g.a((ImageView) this.f25501c);
                if (a10 != null) {
                    o3Var.f25671c = true;
                    o3Var.f25672d = a10;
                }
                PorterDuff.Mode b10 = h4.g.b((ImageView) this.f25501c);
                if (b10 != null) {
                    o3Var.f25670b = true;
                    o3Var.f25673e = b10;
                }
                if (o3Var.f25671c || o3Var.f25670b) {
                    x.e(drawable, o3Var, ((ImageView) this.f25501c).getDrawableState());
                    return;
                }
            }
            o3 o3Var2 = (o3) this.f25503e;
            if (o3Var2 != null) {
                x.e(drawable, o3Var2, ((ImageView) this.f25501c).getDrawableState());
                return;
            }
            o3 o3Var3 = (o3) this.f25502d;
            if (o3Var3 != null) {
                x.e(drawable, o3Var3, ((ImageView) this.f25501c).getDrawableState());
            }
        }
    }

    public final int e(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f25500b, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        e5.a.f();
        return glGetAttribLocation;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        int C;
        Context context = ((ImageView) this.f25501c).getContext();
        int[] iArr = g.a.f16354f;
        h.c N = h.c.N(context, attributeSet, iArr, i10);
        ImageView imageView = (ImageView) this.f25501c;
        d4.n1.m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) N.f17584c, i10);
        try {
            Drawable drawable = ((ImageView) this.f25501c).getDrawable();
            if (drawable == null && (C = N.C(1, -1)) != -1 && (drawable = iu.j.m(((ImageView) this.f25501c).getContext(), C)) != null) {
                ((ImageView) this.f25501c).setImageDrawable(drawable);
            }
            if (drawable != null) {
                q1.a(drawable);
            }
            if (N.H(2)) {
                h4.g.c((ImageView) this.f25501c, N.r(2));
            }
            if (N.H(3)) {
                h4.g.d((ImageView) this.f25501c, q1.c(N.z(3, -1), null));
            }
            N.R();
        } catch (Throwable th2) {
            N.R();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0038 A[EDGE_INSN: B:80:0x0038->B:64:0x0038 BREAK  A[LOOP:3: B:44:0x0020->B:65:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(q7.b r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.c0.g(q7.b, int, int):void");
    }

    public final void h(int i10) {
        if (i10 != 0) {
            Drawable m10 = iu.j.m(((ImageView) this.f25501c).getContext(), i10);
            if (m10 != null) {
                q1.a(m10);
            }
            ((ImageView) this.f25501c).setImageDrawable(m10);
        } else {
            ((ImageView) this.f25501c).setImageDrawable(null);
        }
        c();
    }

    public final void i(ColorStateList colorStateList) {
        if (((o3) this.f25503e) == null) {
            this.f25503e = new o3(0);
        }
        o3 o3Var = (o3) this.f25503e;
        o3Var.f25672d = colorStateList;
        o3Var.f25671c = true;
        c();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((o3) this.f25503e) == null) {
            this.f25503e = new o3(0);
        }
        o3 o3Var = (o3) this.f25503e;
        o3Var.f25673e = mode;
        o3Var.f25670b = true;
        c();
    }

    public final void k(q7.b bVar) {
        bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.f25503e) + "')");
    }

    public final String toString() {
        switch (this.f25499a) {
            case 3:
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("<<\n mode: ");
                sb2.append((rr.b) this.f25501c);
                sb2.append("\n ecLevel: ");
                sb2.append((rr.a) this.f25502d);
                sb2.append("\n version: ");
                sb2.append((rr.c) this.f25503e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.f25500b);
                if (((r4.b) this.f25504f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((r4.b) this.f25504f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [e.j, java.lang.Object] */
    public c0(String str, String str2) {
        int i10 = 1;
        this.f25499a = 1;
        this.f25500b = GLES20.glCreateProgram();
        e5.a.f();
        b(this.f25500b, 35633, str);
        b(this.f25500b, 35632, str2);
        GLES20.glLinkProgram(this.f25500b);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.f25500b, 35714, iArr, 0);
        e5.a.g("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(this.f25500b), iArr[0] == 1);
        GLES20.glUseProgram(this.f25500b);
        this.f25503e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(this.f25500b, 35721, iArr2, 0);
        this.f25501c = new e5.g[iArr2[0]];
        int i11 = 0;
        while (i11 < iArr2[0]) {
            int i12 = this.f25500b;
            int[] iArr3 = new int[i10];
            GLES20.glGetProgramiv(i12, 35722, iArr3, 0);
            int i13 = iArr3[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveAttrib(i12, i11, i13, new int[i10], 0, new int[i10], 0, new int[i10], 0, bArr, 0);
            String str3 = new String(bArr, 0, a(bArr));
            e5.g gVar = new e5.g(str3, i11, GLES20.glGetAttribLocation(i12, str3));
            ((e5.g[]) this.f25501c)[i11] = gVar;
            ((Map) this.f25503e).put(str3, gVar);
            i11++;
            i10 = 1;
        }
        this.f25504f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f25500b, 35718, iArr4, 0);
        this.f25502d = new e.j[iArr4[0]];
        for (int i14 = 0; i14 < iArr4[0]; i14++) {
            int i15 = this.f25500b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i15, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i16 = iArr5[0];
            byte[] bArr2 = new byte[i16];
            GLES20.glGetActiveUniform(i15, i14, i16, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            String str4 = new String(bArr2, 0, a(bArr2));
            int glGetUniformLocation = GLES20.glGetUniformLocation(i15, str4);
            int i17 = iArr6[0];
            ?? obj = new Object();
            obj.f14634c = str4;
            obj.f14632a = glGetUniformLocation;
            obj.f14633b = i17;
            obj.f14635d = new float[16];
            ((e.j[]) this.f25502d)[i14] = obj;
            ((Map) this.f25504f).put(str4, obj);
        }
        e5.a.f();
    }

    public c0(l7.a aVar, eb.f fVar) {
        this.f25499a = 2;
        this.f25500b = fVar.f15308a;
        this.f25501c = aVar;
        this.f25502d = fVar;
        this.f25503e = "c103703e120ae8cc73c9248622f3cd1e";
        this.f25504f = "49f946663a8deb7054212b8adda248c6";
    }
}
