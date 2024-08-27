package y5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import e5.x;
import java.util.concurrent.CopyOnWriteArrayList;
import x5.m;

/* loaded from: classes.dex */
public final class k extends GLSurfaceView {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f41207l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f41208a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f41209b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f41210c;

    /* renamed from: d, reason: collision with root package name */
    public final d f41211d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f41212e;

    /* renamed from: f, reason: collision with root package name */
    public final i f41213f;

    /* renamed from: g, reason: collision with root package name */
    public SurfaceTexture f41214g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f41215h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41216i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41217j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41218k;

    public k(Context context) {
        super(context, null);
        this.f41208a = new CopyOnWriteArrayList();
        this.f41212e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f41209b = sensorManager;
        Sensor defaultSensor = x.f15050a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f41210c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f41213f = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f41211d = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.f41216i = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z10;
        if (this.f41216i && this.f41217j) {
            z10 = true;
        } else {
            z10 = false;
        }
        Sensor sensor = this.f41210c;
        if (sensor != null && z10 != this.f41218k) {
            d dVar = this.f41211d;
            SensorManager sensorManager = this.f41209b;
            if (z10) {
                sensorManager.registerListener(dVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(dVar);
            }
            this.f41218k = z10;
        }
    }

    public a getCameraMotionListener() {
        return this.f41213f;
    }

    public m getVideoFrameMetadataListener() {
        return this.f41213f;
    }

    public Surface getVideoSurface() {
        return this.f41215h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41212e.post(new androidx.activity.b(this, 19));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f41217j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f41217j = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f41213f.f41193k = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f41216i = z10;
        a();
    }
}
