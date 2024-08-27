package x5;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public final class k extends GLSurfaceView implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40031b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final j f40032a;

    public k(Context context) {
        super(context, null);
        j jVar = new j(this);
        this.f40032a = jVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setRenderMode(0);
    }

    @Deprecated
    public l getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(h5.i iVar) {
        j jVar = this.f40032a;
        a3.a.u(jVar.f40029f.getAndSet(iVar));
        jVar.f40024a.requestRender();
    }
}
