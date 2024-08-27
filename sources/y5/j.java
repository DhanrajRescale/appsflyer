package y5;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import e5.m;
import h.m0;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import n5.b0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {

    /* renamed from: a, reason: collision with root package name */
    public final i f41196a;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f41199d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f41200e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f41201f;

    /* renamed from: g, reason: collision with root package name */
    public float f41202g;

    /* renamed from: h, reason: collision with root package name */
    public float f41203h;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f41206k;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f41197b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f41198c = new float[16];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f41204i = new float[16];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f41205j = new float[16];

    public j(k kVar, i iVar) {
        this.f41206k = kVar;
        float[] fArr = new float[16];
        this.f41199d = fArr;
        float[] fArr2 = new float[16];
        this.f41200e = fArr2;
        float[] fArr3 = new float[16];
        this.f41201f = fArr3;
        this.f41196a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f41203h = 3.1415927f;
    }

    @Override // y5.c
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f41199d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.f41203h = f11;
        Matrix.setRotateM(this.f41200e, 0, -this.f41202g, (float) Math.cos(f11), (float) Math.sin(this.f41203h), s0.g.f34069a);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object i10;
        Object i11;
        Object i12;
        float[] fArr2;
        synchronized (this) {
            Matrix.multiplyMM(this.f41205j, 0, this.f41199d, 0, this.f41201f, 0);
            Matrix.multiplyMM(this.f41204i, 0, this.f41200e, 0, this.f41205j, 0);
        }
        Matrix.multiplyMM(this.f41198c, 0, this.f41197b, 0, this.f41204i, 0);
        i iVar = this.f41196a;
        float[] fArr3 = this.f41198c;
        iVar.getClass();
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            e5.a.f();
        } catch (GlUtil$GlException e10) {
            m.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (iVar.f41183a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.f41192j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                e5.a.f();
            } catch (GlUtil$GlException e11) {
                m.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (iVar.f41184b.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.f41189g, 0);
            }
            long timestamp = iVar.f41192j.getTimestamp();
            e.j jVar = iVar.f41187e;
            synchronized (jVar) {
                i10 = jVar.i(timestamp, false);
            }
            Long l10 = (Long) i10;
            if (l10 != null) {
                b0 b0Var = iVar.f41186d;
                float[] fArr4 = iVar.f41189g;
                long longValue = l10.longValue();
                e.j jVar2 = (e.j) b0Var.f28250e;
                synchronized (jVar2) {
                    i12 = jVar2.i(longValue, true);
                }
                float[] fArr5 = (float[]) i12;
                if (fArr5 != null) {
                    float[] fArr6 = (float[]) b0Var.f28249d;
                    float f10 = fArr5[0];
                    float f11 = -fArr5[1];
                    float f12 = -fArr5[2];
                    float length = Matrix.length(f10, f11, f12);
                    if (length != s0.g.f34069a) {
                        fArr2 = fArr4;
                        Matrix.setRotateM(fArr6, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
                    } else {
                        fArr2 = fArr4;
                        Matrix.setIdentityM(fArr6, 0);
                    }
                    boolean z10 = b0Var.f28247b;
                    Object obj = b0Var.f28248c;
                    if (!z10) {
                        b0.d((float[]) obj, (float[]) b0Var.f28249d);
                        b0Var.f28247b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) obj, 0, (float[]) b0Var.f28249d, 0);
                }
            }
            e.j jVar3 = iVar.f41188f;
            synchronized (jVar3) {
                i11 = jVar3.i(timestamp, true);
            }
            f fVar = (f) i11;
            if (fVar != null) {
                g gVar = iVar.f41185c;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.f41174a = fVar.f41169c;
                    gVar.f41175b = new e.j(fVar.f41167a.f41166a[0]);
                    if (!fVar.f41170d) {
                        e.j jVar4 = fVar.f41168b.f41166a[0];
                        Object obj2 = jVar4.f14634c;
                        int length2 = ((float[]) obj2).length / 3;
                        e5.a.h((float[]) obj2);
                        e5.a.h((float[]) jVar4.f14635d);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.f41190h, 0, fArr3, 0, iVar.f41189g, 0);
        g gVar2 = iVar.f41185c;
        int i13 = iVar.f41191i;
        float[] fArr7 = iVar.f41190h;
        e.j jVar5 = gVar2.f41175b;
        if (jVar5 != null) {
            int i14 = gVar2.f41174a;
            if (i14 == 1) {
                fArr = g.f41172j;
            } else if (i14 == 2) {
                fArr = g.f41173k;
            } else {
                fArr = g.f41171i;
            }
            GLES20.glUniformMatrix3fv(gVar2.f41178e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(gVar2.f41177d, 1, false, fArr7, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i13);
            GLES20.glUniform1i(gVar2.f41181h, 0);
            try {
                e5.a.f();
            } catch (GlUtil$GlException e12) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
            }
            GLES20.glVertexAttribPointer(gVar2.f41179f, 3, 5126, false, 12, (Buffer) jVar5.f14634c);
            try {
                e5.a.f();
            } catch (GlUtil$GlException e13) {
                Log.e("ProjectionRenderer", "Failed to load position data", e13);
            }
            GLES20.glVertexAttribPointer(gVar2.f41180g, 2, 5126, false, 8, (Buffer) jVar5.f14635d);
            try {
                e5.a.f();
            } catch (GlUtil$GlException e14) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e14);
            }
            GLES20.glDrawArrays(jVar5.f14633b, 0, jVar5.f14632a);
            try {
                e5.a.f();
            } catch (GlUtil$GlException e15) {
                Log.e("ProjectionRenderer", "Failed to render", e15);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f10;
        GLES20.glViewport(0, 0, i10, i11);
        float f11 = i10 / i11;
        if (f11 > 1.0f) {
            f10 = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f11)) * 2.0d);
        } else {
            f10 = 90.0f;
        }
        Matrix.perspectiveM(this.f41197b, 0, f10, f11, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.f41206k;
        kVar.f41212e.post(new m0(18, kVar, this.f41196a.c()));
    }
}
