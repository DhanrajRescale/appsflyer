package an;

import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import cn.i;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import tm.j;
import um.h;

/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public Matrix f769e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f770f;

    /* renamed from: g, reason: collision with root package name */
    public cn.d f771g;

    /* renamed from: h, reason: collision with root package name */
    public cn.d f772h;

    /* renamed from: i, reason: collision with root package name */
    public float f773i;

    /* renamed from: j, reason: collision with root package name */
    public float f774j;

    /* renamed from: k, reason: collision with root package name */
    public float f775k;

    /* renamed from: l, reason: collision with root package name */
    public ym.a f776l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f777m;

    /* renamed from: n, reason: collision with root package name */
    public long f778n;

    /* renamed from: o, reason: collision with root package name */
    public cn.d f779o;

    /* renamed from: p, reason: collision with root package name */
    public cn.d f780p;

    /* renamed from: q, reason: collision with root package name */
    public float f781q;

    /* renamed from: r, reason: collision with root package name */
    public float f782r;

    public static float d(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x10 * x10));
    }

    public final cn.d a(float f10, float f11) {
        i viewPortHandler = ((sm.a) this.f786d).getViewPortHandler();
        float f12 = f10 - viewPortHandler.f8275b.left;
        b();
        return cn.d.b(f12, -((r0.getMeasuredHeight() - f11) - (viewPortHandler.f8277d - viewPortHandler.f8275b.bottom)));
    }

    public final void b() {
        j jVar;
        ym.a aVar = this.f776l;
        sm.b bVar = this.f786d;
        if (aVar == null) {
            sm.a aVar2 = (sm.a) bVar;
            aVar2.f34684p0.getClass();
            aVar2.f34685q0.getClass();
        }
        ym.b bVar2 = this.f776l;
        if (bVar2 != null) {
            sm.a aVar3 = (sm.a) bVar;
            if (((h) bVar2).f37260d == 1) {
                jVar = aVar3.f34684p0;
            } else {
                jVar = aVar3.f34685q0;
            }
            jVar.getClass();
        }
    }

    public final void c(MotionEvent motionEvent) {
        ym.a aVar;
        this.f770f.set(this.f769e);
        float x10 = motionEvent.getX();
        cn.d dVar = this.f771g;
        dVar.f8247b = x10;
        dVar.f8248c = motionEvent.getY();
        sm.a aVar2 = (sm.a) this.f786d;
        wm.c e10 = aVar2.e(motionEvent.getX(), motionEvent.getY());
        if (e10 != null) {
            aVar = (ym.a) ((um.d) aVar2.f34696b).b(e10.f39311e);
        } else {
            aVar = null;
        }
        this.f776l = aVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f10;
        sm.a aVar = (sm.a) this.f786d;
        aVar.getOnChartGestureListener();
        if (aVar.I && ((um.d) aVar.getData()).d() > 0) {
            cn.d a10 = a(motionEvent.getX(), motionEvent.getY());
            float f11 = 1.0f;
            if (aVar.f34676g0) {
                f10 = 1.4f;
            } else {
                f10 = 1.0f;
            }
            if (aVar.f34677h0) {
                f11 = 1.4f;
            }
            float f12 = a10.f8247b;
            float f13 = -a10.f8248c;
            Matrix matrix = aVar.f34694z0;
            i iVar = aVar.f34713s;
            iVar.getClass();
            matrix.reset();
            matrix.set(iVar.f8274a);
            matrix.postScale(f10, f11, f12, f13);
            iVar.f(matrix, aVar, false);
            aVar.b();
            aVar.postInvalidate();
            if (aVar.f34695a) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + a10.f8247b + ", y: " + a10.f8248c);
            }
            cn.d.c(a10);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ((sm.a) this.f786d).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f10, f11);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((sm.a) this.f786d).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sm.a aVar = (sm.a) this.f786d;
        aVar.getOnChartGestureListener();
        if (!aVar.f34697c) {
            return false;
        }
        wm.c e10 = aVar.e(motionEvent.getX(), motionEvent.getY());
        sm.b bVar = this.f786d;
        if (e10 != null && !e10.a(this.f784b)) {
            bVar.g(e10);
            this.f784b = e10;
        } else {
            bVar.g(null);
            this.f784b = null;
        }
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        wm.c e10;
        float f11;
        VelocityTracker velocityTracker;
        if (this.f777m == null) {
            this.f777m = VelocityTracker.obtain();
        }
        this.f777m.addMovement(motionEvent);
        int i10 = 3;
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.f777m) != null) {
            velocityTracker.recycle();
            this.f777m = null;
        }
        if (this.f783a == 0) {
            this.f785c.onTouchEvent(motionEvent);
        }
        sm.b bVar = this.f786d;
        sm.a aVar = (sm.a) bVar;
        int i11 = 0;
        if (!aVar.f34674e0 && !aVar.f34675f0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !aVar.f34676g0 && !aVar.f34677h0) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        float f12 = s0.g.f34069a;
        if (action != 0) {
            if (action != 1) {
                cn.d dVar = this.f772h;
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                VelocityTracker velocityTracker2 = this.f777m;
                                velocityTracker2.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, cn.h.f8266c);
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                                int pointerCount = motionEvent.getPointerCount();
                                while (true) {
                                    if (i11 >= pointerCount) {
                                        break;
                                    }
                                    if (i11 != actionIndex) {
                                        int pointerId2 = motionEvent.getPointerId(i11);
                                        if ((velocityTracker2.getYVelocity(pointerId2) * yVelocity) + (velocityTracker2.getXVelocity(pointerId2) * xVelocity) < s0.g.f34069a) {
                                            velocityTracker2.clear();
                                            break;
                                        }
                                    }
                                    i11++;
                                }
                                this.f783a = 5;
                            }
                        } else if (motionEvent.getPointerCount() >= 2) {
                            ViewParent parent = aVar.getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            c(motionEvent);
                            this.f773i = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                            this.f774j = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                            float d10 = d(motionEvent);
                            this.f775k = d10;
                            if (d10 > 10.0f) {
                                if (aVar.H) {
                                    this.f783a = 4;
                                } else {
                                    boolean z13 = aVar.f34676g0;
                                    if (z13 != aVar.f34677h0) {
                                        if (z13) {
                                            i10 = 2;
                                        }
                                        this.f783a = i10;
                                    } else {
                                        if (this.f773i > this.f774j) {
                                            i10 = 2;
                                        }
                                        this.f783a = i10;
                                    }
                                }
                            }
                            float x10 = motionEvent.getX(1) + motionEvent.getX(0);
                            float y10 = motionEvent.getY(1) + motionEvent.getY(0);
                            dVar.f8247b = x10 / 2.0f;
                            dVar.f8248c = y10 / 2.0f;
                        }
                    } else {
                        this.f783a = 0;
                        this.f786d.getOnChartGestureListener();
                    }
                } else {
                    int i12 = this.f783a;
                    cn.d dVar2 = this.f771g;
                    if (i12 == 1) {
                        ViewParent parent2 = aVar.getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        if (aVar.f34674e0) {
                            f11 = motionEvent.getX() - dVar2.f8247b;
                        } else {
                            f11 = 0.0f;
                        }
                        if (aVar.f34675f0) {
                            f12 = motionEvent.getY() - dVar2.f8248c;
                        }
                        this.f769e.set(this.f770f);
                        ((sm.a) this.f786d).getOnChartGestureListener();
                        b();
                        this.f769e.postTranslate(f11, f12);
                    } else {
                        float f13 = 1.0f;
                        if (i12 != 2 && i12 != 3 && i12 != 4) {
                            if (i12 == 0) {
                                float x11 = motionEvent.getX() - dVar2.f8247b;
                                float y11 = motionEvent.getY() - dVar2.f8248c;
                                if (Math.abs((float) Math.sqrt((y11 * y11) + (x11 * x11))) > this.f781q && (aVar.f34674e0 || aVar.f34675f0)) {
                                    i iVar = aVar.f34713s;
                                    float f14 = iVar.f8282i;
                                    float f15 = iVar.f8280g;
                                    if (f14 <= f15 && f15 <= 1.0f) {
                                        i11 = 1;
                                    }
                                    if (i11 != 0) {
                                        float f16 = iVar.f8283j;
                                        float f17 = iVar.f8278e;
                                        if (f16 <= f17 && f17 <= 1.0f && iVar.f8285l <= s0.g.f34069a && iVar.f8286m <= s0.g.f34069a) {
                                            boolean z14 = aVar.J;
                                            if (z14 && z14 && (e10 = aVar.e(motionEvent.getX(), motionEvent.getY())) != null && !e10.a(this.f784b)) {
                                                this.f784b = e10;
                                                aVar.g(e10);
                                            }
                                        }
                                    }
                                    float abs = Math.abs(motionEvent.getX() - dVar2.f8247b);
                                    float abs2 = Math.abs(motionEvent.getY() - dVar2.f8248c);
                                    if ((aVar.f34674e0 || abs2 >= abs) && (aVar.f34675f0 || abs2 <= abs)) {
                                        this.f783a = 1;
                                    }
                                }
                            }
                        } else {
                            ViewParent parent3 = aVar.getParent();
                            if (parent3 != null) {
                                parent3.requestDisallowInterceptTouchEvent(true);
                            }
                            if ((aVar.f34676g0 || aVar.f34677h0) && motionEvent.getPointerCount() >= 2) {
                                aVar.getOnChartGestureListener();
                                float d11 = d(motionEvent);
                                if (d11 > this.f782r) {
                                    cn.d a10 = a(dVar.f8247b, dVar.f8248c);
                                    i viewPortHandler = aVar.getViewPortHandler();
                                    int i13 = this.f783a;
                                    Matrix matrix = this.f770f;
                                    if (i13 == 4) {
                                        float f18 = d11 / this.f775k;
                                        if (f18 < 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (!z11 ? viewPortHandler.f8282i < viewPortHandler.f8281h : viewPortHandler.f8282i > viewPortHandler.f8280g) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z11 ? viewPortHandler.f8283j < viewPortHandler.f8279f : viewPortHandler.f8283j > viewPortHandler.f8278e) {
                                            i11 = 1;
                                        }
                                        if (aVar.f34676g0) {
                                            f10 = f18;
                                        } else {
                                            f10 = 1.0f;
                                        }
                                        if (aVar.f34677h0) {
                                            f13 = f18;
                                        }
                                        if (i11 != 0 || z12) {
                                            this.f769e.set(matrix);
                                            this.f769e.postScale(f10, f13, a10.f8247b, a10.f8248c);
                                        }
                                    } else if (i13 == 2 && aVar.f34676g0) {
                                        float abs3 = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.f773i;
                                        if (abs3 >= 1.0f ? viewPortHandler.f8282i < viewPortHandler.f8281h : viewPortHandler.f8282i > viewPortHandler.f8280g) {
                                            this.f769e.set(matrix);
                                            this.f769e.postScale(abs3, 1.0f, a10.f8247b, a10.f8248c);
                                        }
                                    } else if (i13 == 3 && aVar.f34677h0) {
                                        float abs4 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.f774j;
                                        if (abs4 >= 1.0f ? viewPortHandler.f8283j < viewPortHandler.f8279f : viewPortHandler.f8283j > viewPortHandler.f8278e) {
                                            this.f769e.set(matrix);
                                            this.f769e.postScale(1.0f, abs4, a10.f8247b, a10.f8248c);
                                        }
                                    }
                                    cn.d.c(a10);
                                }
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker3 = this.f777m;
                int pointerId3 = motionEvent.getPointerId(0);
                velocityTracker3.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, cn.h.f8266c);
                float yVelocity2 = velocityTracker3.getYVelocity(pointerId3);
                float xVelocity2 = velocityTracker3.getXVelocity(pointerId3);
                if ((Math.abs(xVelocity2) > cn.h.f8265b || Math.abs(yVelocity2) > cn.h.f8265b) && this.f783a == 1 && aVar.f34698d) {
                    cn.d dVar3 = this.f780p;
                    dVar3.f8247b = s0.g.f34069a;
                    dVar3.f8248c = s0.g.f34069a;
                    this.f778n = AnimationUtils.currentAnimationTimeMillis();
                    float x12 = motionEvent.getX();
                    cn.d dVar4 = this.f779o;
                    dVar4.f8247b = x12;
                    dVar4.f8248c = motionEvent.getY();
                    cn.d dVar5 = this.f780p;
                    dVar5.f8247b = xVelocity2;
                    dVar5.f8248c = yVelocity2;
                    bVar.postInvalidateOnAnimation();
                }
                int i14 = this.f783a;
                if (i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5) {
                    aVar.b();
                    aVar.postInvalidate();
                }
                this.f783a = 0;
                ViewParent parent4 = aVar.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker4 = this.f777m;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.f777m = null;
                }
                this.f786d.getOnChartGestureListener();
            }
        } else {
            this.f786d.getOnChartGestureListener();
            cn.d dVar6 = this.f780p;
            dVar6.f8247b = s0.g.f34069a;
            dVar6.f8248c = s0.g.f34069a;
            c(motionEvent);
        }
        i viewPortHandler2 = aVar.getViewPortHandler();
        Matrix matrix2 = this.f769e;
        viewPortHandler2.f(matrix2, bVar, true);
        this.f769e = matrix2;
        return true;
    }
}
