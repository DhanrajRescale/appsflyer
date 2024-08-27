package y5;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import m.c0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f41171i = {1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, -1.0f, s0.g.f34069a, s0.g.f34069a, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f41172j = {1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, -0.5f, s0.g.f34069a, s0.g.f34069a, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f41173k = {0.5f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, -1.0f, s0.g.f34069a, s0.g.f34069a, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f41174a;

    /* renamed from: b, reason: collision with root package name */
    public e.j f41175b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f41176c;

    /* renamed from: d, reason: collision with root package name */
    public int f41177d;

    /* renamed from: e, reason: collision with root package name */
    public int f41178e;

    /* renamed from: f, reason: collision with root package name */
    public int f41179f;

    /* renamed from: g, reason: collision with root package name */
    public int f41180g;

    /* renamed from: h, reason: collision with root package name */
    public int f41181h;

    public static boolean b(f fVar) {
        e.j[] jVarArr = fVar.f41167a.f41166a;
        if (jVarArr.length != 1 || jVarArr[0].f14632a != 0) {
            return false;
        }
        e.j[] jVarArr2 = fVar.f41168b.f41166a;
        if (jVarArr2.length != 1 || jVarArr2[0].f14632a != 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        try {
            c0 c0Var = new c0("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f41176c = c0Var;
            this.f41177d = GLES20.glGetUniformLocation(c0Var.f25500b, "uMvpMatrix");
            this.f41178e = GLES20.glGetUniformLocation(this.f41176c.f25500b, "uTexMatrix");
            this.f41179f = this.f41176c.e("aPosition");
            this.f41180g = this.f41176c.e("aTexCoords");
            this.f41181h = GLES20.glGetUniformLocation(this.f41176c.f25500b, "uTexture");
        } catch (GlUtil$GlException e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
