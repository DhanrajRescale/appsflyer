package i5;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class d0 implements x5.w, t5.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f19384a;

    public d0(g0 g0Var) {
        this.f19384a = g0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        g0 g0Var = this.f19384a;
        g0Var.getClass();
        Surface surface = new Surface(surfaceTexture);
        g0Var.R(surface);
        g0Var.Q = surface;
        g0Var.H(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        g0 g0Var = this.f19384a;
        g0Var.R(null);
        g0Var.H(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f19384a.H(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f19384a.H(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        g0 g0Var = this.f19384a;
        if (g0Var.T) {
            g0Var.R(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        g0 g0Var = this.f19384a;
        if (g0Var.T) {
            g0Var.R(null);
        }
        g0Var.H(0, 0);
    }
}
