package x5;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import m.c0;

/* loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f40022h = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f40023i = e5.a.h(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: a, reason: collision with root package name */
    public final GLSurfaceView f40024a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f40025b = new int[3];

    /* renamed from: c, reason: collision with root package name */
    public final int[] f40026c = new int[3];

    /* renamed from: d, reason: collision with root package name */
    public final int[] f40027d = new int[3];

    /* renamed from: e, reason: collision with root package name */
    public final int[] f40028e = new int[3];

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f40029f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public c0 f40030g;

    public j(GLSurfaceView gLSurfaceView) {
        this.f40024a = gLSurfaceView;
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = this.f40027d;
            this.f40028e[i10] = -1;
            iArr[i10] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.f40025b;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                c0 c0Var = this.f40030g;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(c0Var.f25500b, f40022h[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                e5.a.b(3553, iArr[i10]);
            }
            e5.a.f();
        } catch (GlUtil$GlException e10) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        a3.a.u(this.f40029f.getAndSet(null));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f40026c;
        try {
            c0 c0Var = new c0("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f40030g = c0Var;
            GLES20.glVertexAttribPointer(c0Var.e("in_pos"), 2, 5126, false, 0, (Buffer) f40023i);
            iArr[0] = this.f40030g.e("in_tc_y");
            iArr[1] = this.f40030g.e("in_tc_u");
            iArr[2] = this.f40030g.e("in_tc_v");
            GLES20.glGetUniformLocation(this.f40030g.f25500b, "mColorConversion");
            e5.a.f();
            a();
            e5.a.f();
        } catch (GlUtil$GlException e10) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
        }
    }
}
