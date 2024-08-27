package in.juspay.hypersdk.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class BlurProcessor {
    Activity activity;
    Allocation allocBlurred;
    Allocation allocOriginalScreenshot;
    RenderScript mRS;
    ScriptIntrinsicBlur scriptIntrinsicBlur;
    TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: in.juspay.hypersdk.core.BlurProcessor.1
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            BlurProcessor.this.allocBlurred.setSurface(new Surface(surfaceTexture));
            BlurProcessor.this.executeBlur();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    };
    TextureView textureViewBlurred;

    public BlurProcessor(RenderScript renderScript, int i10, Activity activity) {
        this.mRS = renderScript;
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.RGBA_8888(renderScript));
        this.scriptIntrinsicBlur = create;
        create.setRadius(i10);
        this.activity = activity;
    }

    public static Bitmap getBitmapFromView(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.draw(canvas);
        return createBitmap;
    }

    public void blurView(View view, View view2) {
        if (view == null || this.activity == null || view2 == null) {
            return;
        }
        Bitmap bitmapFromView = getBitmapFromView(view);
        Allocation allocation = this.allocOriginalScreenshot;
        if (allocation != null && (allocation.getType().getX() != bitmapFromView.getWidth() || this.allocOriginalScreenshot.getType().getY() != bitmapFromView.getHeight())) {
            this.allocOriginalScreenshot.destroy();
            this.allocBlurred.destroy();
            this.textureViewBlurred = null;
            this.allocOriginalScreenshot = null;
            this.allocBlurred = null;
        }
        Allocation allocation2 = this.allocOriginalScreenshot;
        if (allocation2 == null) {
            Allocation createFromBitmap = Allocation.createFromBitmap(this.mRS, bitmapFromView);
            this.allocOriginalScreenshot = createFromBitmap;
            this.allocBlurred = Allocation.createTyped(this.mRS, createFromBitmap.getType(), 65);
            TextureView textureView = new TextureView(this.activity);
            this.textureViewBlurred = textureView;
            textureView.setOpaque(false);
            this.textureViewBlurred.setSurfaceTextureListener(this.surfaceTextureListener);
        } else {
            allocation2.copyFrom(bitmapFromView);
        }
        replaceView(view2, this.textureViewBlurred);
    }

    public void executeBlur() {
        this.scriptIntrinsicBlur.setInput(this.allocOriginalScreenshot);
        this.scriptIntrinsicBlur.forEach(this.allocBlurred);
        this.allocBlurred.ioSend();
    }

    public void replaceView(View view, View view2) {
        view2.setLayoutParams(new FrameLayout.LayoutParams(view.getLayoutParams()));
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.addView(view2, viewGroup.indexOfChild(view));
    }
}
