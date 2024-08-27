package ak;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import d4.n1;
import d4.y0;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f491a;

    public /* synthetic */ h0(int i10) {
        this.f491a = i10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i10 = 1;
        int i11 = 0;
        switch (this.f491a) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((e0) message.obj).b();
                return true;
            default:
                int i12 = message.what;
                if (i12 != 0) {
                    if (i12 != 1) {
                        return false;
                    }
                    wo.k kVar = (wo.k) message.obj;
                    int i13 = message.arg1;
                    AccessibilityManager accessibilityManager = kVar.f39402u;
                    if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                        wo.j jVar = kVar.f39390i;
                        if (jVar.getVisibility() == 0) {
                            if (jVar.getAnimationMode() == 1) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, s0.g.f34069a);
                                ofFloat.setInterpolator(kVar.f39385d);
                                ofFloat.addUpdateListener(new wo.b(kVar, 0));
                                ofFloat.setDuration(kVar.f39383b);
                                ofFloat.addListener(new wo.a(kVar, i13, i11));
                                ofFloat.start();
                                return true;
                            }
                            ValueAnimator valueAnimator = new ValueAnimator();
                            int height = jVar.getHeight();
                            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            }
                            valueAnimator.setIntValues(0, height);
                            valueAnimator.setInterpolator(kVar.f39386e);
                            valueAnimator.setDuration(kVar.f39384c);
                            valueAnimator.addListener(new wo.a(kVar, i13, i10));
                            valueAnimator.addUpdateListener(new wo.e(kVar));
                            valueAnimator.start();
                            return true;
                        }
                    }
                    kVar.c();
                    return true;
                }
                wo.k kVar2 = (wo.k) message.obj;
                wo.j jVar2 = kVar2.f39390i;
                if (jVar2.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams2 = jVar2.getLayoutParams();
                    if (layoutParams2 instanceof o3.e) {
                        o3.e eVar = (o3.e) layoutParams2;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        ek.u uVar = baseTransientBottomBar$Behavior.f11431j;
                        uVar.getClass();
                        uVar.f15627b = kVar2.f39403v;
                        baseTransientBottomBar$Behavior.f11160b = new ek.h0(kVar2, 13);
                        eVar.b(baseTransientBottomBar$Behavior);
                        if (kVar2.b() == null) {
                            eVar.f29550g = 80;
                        }
                    }
                    jVar2.f39377k = true;
                    ViewGroup viewGroup = kVar2.f39388g;
                    viewGroup.addView(jVar2);
                    jVar2.f39377k = false;
                    if (kVar2.b() != null) {
                        int[] iArr = new int[2];
                        kVar2.b().getLocationOnScreen(iArr);
                        int i14 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        i11 = (viewGroup.getHeight() + iArr2[1]) - i14;
                    }
                    kVar2.f39398q = i11;
                    kVar2.f();
                    jVar2.setVisibility(4);
                }
                WeakHashMap weakHashMap = n1.f13788a;
                if (y0.c(jVar2)) {
                    kVar2.e();
                    return true;
                }
                kVar2.f39401t = true;
                return true;
        }
    }
}
