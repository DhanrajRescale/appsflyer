package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1714c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1715d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f1716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f2 operation, y3.g signal, boolean z10) {
        super(operation, signal);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.f1714c = z10;
    }

    public final a0 c(Context context) {
        boolean z10;
        int exitAnim;
        Animation loadAnimation;
        a0 a0Var;
        a0 a0Var2;
        int i10;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f1715d) {
            return this.f1716e;
        }
        f2 f2Var = this.f1723a;
        g0 g0Var = f2Var.f1698c;
        if (f2Var.f1696a == e2.f1679b) {
            z10 = true;
        } else {
            z10 = false;
        }
        int nextTransition = g0Var.getNextTransition();
        if (this.f1714c) {
            if (z10) {
                exitAnim = g0Var.getPopEnterAnim();
            } else {
                exitAnim = g0Var.getPopExitAnim();
            }
        } else if (z10) {
            exitAnim = g0Var.getEnterAnim();
        } else {
            exitAnim = g0Var.getExitAnim();
        }
        g0Var.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = g0Var.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            g0Var.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = g0Var.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = g0Var.onCreateAnimation(nextTransition, z10, exitAnim);
            if (onCreateAnimation != null) {
                a0Var2 = new a0(onCreateAnimation);
            } else {
                Animator onCreateAnimator = g0Var.onCreateAnimator(nextTransition, z10, exitAnim);
                if (onCreateAnimator != null) {
                    a0Var2 = new a0(onCreateAnimator);
                } else {
                    if (exitAnim == 0 && nextTransition != 0) {
                        if (nextTransition != 4097) {
                            if (nextTransition != 8194) {
                                if (nextTransition != 8197) {
                                    if (nextTransition != 4099) {
                                        if (nextTransition != 4100) {
                                            i10 = -1;
                                        } else if (z10) {
                                            i10 = dp.b.O1(android.R.attr.activityOpenEnterAnimation, context);
                                        } else {
                                            i10 = dp.b.O1(android.R.attr.activityOpenExitAnimation, context);
                                        }
                                    } else if (z10) {
                                        i10 = R.animator.fragment_fade_enter;
                                    } else {
                                        i10 = R.animator.fragment_fade_exit;
                                    }
                                } else if (z10) {
                                    i10 = dp.b.O1(android.R.attr.activityCloseEnterAnimation, context);
                                } else {
                                    i10 = dp.b.O1(android.R.attr.activityCloseExitAnimation, context);
                                }
                            } else if (z10) {
                                i10 = R.animator.fragment_close_enter;
                            } else {
                                i10 = R.animator.fragment_close_exit;
                            }
                        } else if (z10) {
                            i10 = R.animator.fragment_open_enter;
                        } else {
                            i10 = R.animator.fragment_open_exit;
                        }
                        exitAnim = i10;
                    }
                    if (exitAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                                } catch (Resources.NotFoundException e10) {
                                    throw e10;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    a0Var = new a0(loadAnimation);
                                    a0Var2 = a0Var;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                            if (loadAnimator != null) {
                                a0Var = new a0(loadAnimator);
                                a0Var2 = a0Var;
                            }
                        } catch (RuntimeException e11) {
                            if (!equals) {
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                if (loadAnimation2 != null) {
                                    a0Var2 = new a0(loadAnimation2);
                                }
                            } else {
                                throw e11;
                            }
                        }
                    }
                }
            }
            this.f1716e = a0Var2;
            this.f1715d = true;
            return a0Var2;
        }
        a0Var2 = null;
        this.f1716e = a0Var2;
        this.f1715d = true;
        return a0Var2;
    }
}
