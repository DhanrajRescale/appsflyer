package ef;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import d4.b1;
import d4.n1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k7.i0;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import r3.k;
import rd.m;
import s0.g;
import yd.r;

/* loaded from: classes.dex */
public final class b extends i0 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f15407d;

    /* renamed from: e, reason: collision with root package name */
    public final m f15408e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f15409f;

    /* renamed from: g, reason: collision with root package name */
    public View f15410g;

    /* renamed from: h, reason: collision with root package name */
    public float f15411h;

    /* renamed from: i, reason: collision with root package name */
    public float f15412i;

    /* renamed from: j, reason: collision with root package name */
    public long f15413j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15414k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15415l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15416m;

    /* renamed from: n, reason: collision with root package name */
    public float f15417n;

    public b(Context context, m swipeControllerActions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(swipeControllerActions, "swipeControllerActions");
        this.f22403a = -1;
        this.f15407d = context;
        this.f15408e = swipeControllerActions;
        this.f15417n = 1.0f;
    }

    @Override // k7.i0
    public final int b(int i10, int i11) {
        int i12;
        if (this.f15414k) {
            this.f15414k = false;
            return 0;
        }
        int i13 = i10 & 3158064;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 >> 2;
        } else {
            int i15 = i13 >> 1;
            i14 |= (-3158065) & i15;
            i12 = (i15 & 3158064) >> 2;
        }
        return i14 | i12;
    }

    @Override // k7.i0
    public final int d(RecyclerView recyclerView, y1 viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View itemView = viewHolder.f22629a;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        this.f15410g = itemView;
        this.f15409f = this.f15407d.getDrawable(R.drawable.ic_message_reply);
        return 3084;
    }

    @Override // k7.i0
    public final void f(Canvas c10, RecyclerView recyclerView, final y1 viewHolder, float f10, float f11, int i10, boolean z10) {
        boolean z11;
        float f12;
        float min;
        int translationX;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (i10 == 1) {
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: ef.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    b this$0 = b.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    y1 viewHolder2 = viewHolder;
                    Intrinsics.checkNotNullParameter(viewHolder2, "$viewHolder");
                    boolean z12 = true;
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        z12 = false;
                    }
                    this$0.f15414k = z12;
                    if (z12) {
                        View view2 = this$0.f15410g;
                        if (view2 != null) {
                            if (Math.abs(view2.getTranslationX()) >= this$0.g(100)) {
                                int d10 = viewHolder2.d();
                                GroupChatFragment groupChatFragment = this$0.f15408e.f33634a;
                                r rVar = groupChatFragment.f9157q;
                                if (rVar != null) {
                                    ArrayList arrayList = rVar.f41586e;
                                    if (d10 >= 0 && d10 < arrayList.size()) {
                                        ChatMessage chatMessage = (ChatMessage) arrayList.get(d10);
                                        if (!chatMessage.isReported()) {
                                            ((GroupChatViewModel) groupChatFragment.r()).f9199z.add(chatMessage);
                                            groupChatFragment.P(chatMessage, ((GroupChatViewModel) groupChatFragment.r()).f9183r);
                                        }
                                    }
                                } else {
                                    Intrinsics.k("messagesAdapter");
                                    throw null;
                                }
                            }
                        } else {
                            Intrinsics.k("mView");
                            throw null;
                        }
                    }
                    return false;
                }
            });
        }
        View view = this.f15410g;
        if (view != null) {
            if (view.getTranslationX() < g(130) || f10 < this.f15411h) {
                View view2 = viewHolder.f22629a;
                if (z10 && view2.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    Float valueOf = Float.valueOf(b1.i(view2));
                    int childCount = recyclerView.getChildCount();
                    float f13 = 0.0f;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = recyclerView.getChildAt(i11);
                        if (childAt != view2) {
                            WeakHashMap weakHashMap2 = n1.f13788a;
                            float i12 = b1.i(childAt);
                            if (i12 > f13) {
                                f13 = i12;
                            }
                        }
                    }
                    b1.s(view2, f13 + 1.0f);
                    view2.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
                }
                view2.setTranslationX(f10);
                view2.setTranslationY(f11);
                this.f15411h = f10;
                this.f15416m = true;
            }
            if (viewHolder != null) {
                View view3 = this.f15410g;
                if (view3 != null) {
                    float translationX2 = view3.getTranslationX();
                    long currentTimeMillis = System.currentTimeMillis();
                    long min2 = Math.min(17L, currentTimeMillis - this.f15413j);
                    this.f15413j = currentTimeMillis;
                    if (translationX2 >= g(30)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        float f14 = this.f15412i;
                        if (f14 < 1.0f) {
                            float f15 = (((float) min2) / 180.0f) + f14;
                            this.f15412i = f15;
                            if (f15 > 1.0f) {
                                this.f15412i = 1.0f;
                            } else {
                                View view4 = this.f15410g;
                                if (view4 != null) {
                                    view4.invalidate();
                                } else {
                                    Intrinsics.k("mView");
                                    throw null;
                                }
                            }
                        }
                    } else if (translationX2 <= g.f34069a) {
                        this.f15412i = g.f34069a;
                        this.f15416m = false;
                        this.f15415l = false;
                    } else {
                        float f16 = this.f15412i;
                        if (f16 > g.f34069a) {
                            float f17 = f16 - (((float) min2) / 180.0f);
                            this.f15412i = f17;
                            if (f17 < 0.1f) {
                                this.f15412i = g.f34069a;
                            } else {
                                View view5 = this.f15410g;
                                if (view5 != null) {
                                    view5.invalidate();
                                } else {
                                    Intrinsics.k("mView");
                                    throw null;
                                }
                            }
                        }
                    }
                    if (z11) {
                        float f18 = this.f15412i;
                        if (f18 <= 0.8f) {
                            f12 = (f18 / 0.8f) * 1.2f;
                        } else {
                            f12 = 1.2f - (((f18 - 0.8f) / 0.2f) * 0.2f);
                        }
                        min = Math.min(255.0f, (f18 / 0.8f) * 255);
                    } else {
                        f12 = this.f15412i;
                        min = Math.min(255.0f, 255 * f12);
                    }
                    int i13 = (int) min;
                    Drawable drawable = this.f15409f;
                    if (drawable != null) {
                        drawable.setAlpha(i13);
                    }
                    if (this.f15416m && !this.f15415l) {
                        View view6 = this.f15410g;
                        if (view6 != null) {
                            if (view6.getTranslationX() >= g(100)) {
                                View view7 = this.f15410g;
                                if (view7 != null) {
                                    view7.performHapticFeedback(3, 2);
                                    this.f15415l = true;
                                } else {
                                    Intrinsics.k("mView");
                                    throw null;
                                }
                            }
                        } else {
                            Intrinsics.k("mView");
                            throw null;
                        }
                    }
                    View view8 = this.f15410g;
                    if (view8 != null) {
                        if (view8.getTranslationX() > g(130)) {
                            translationX = g(130) / 2;
                        } else {
                            View view9 = this.f15410g;
                            if (view9 != null) {
                                translationX = (int) (view9.getTranslationX() / 2);
                            } else {
                                Intrinsics.k("mView");
                                throw null;
                            }
                        }
                        View view10 = this.f15410g;
                        if (view10 != null) {
                            int top = view10.getTop();
                            View view11 = this.f15410g;
                            if (view11 != null) {
                                float measuredHeight = (view11.getMeasuredHeight() / 2) + top;
                                Drawable drawable2 = this.f15409f;
                                if (drawable2 != null) {
                                    drawable2.setColorFilter(new PorterDuffColorFilter(k.getColor(this.f15407d, R.color.colorPrimaryDark), PorterDuff.Mode.MULTIPLY));
                                }
                                Drawable drawable3 = this.f15409f;
                                if (drawable3 != null) {
                                    float f19 = translationX;
                                    drawable3.setBounds((int) (f19 - (g(12) * f12)), (int) (measuredHeight - (g(11) * f12)), (int) ((g(12) * f12) + f19), (int) ((g(10) * f12) + measuredHeight));
                                }
                                Drawable drawable4 = this.f15409f;
                                if (drawable4 != null) {
                                    drawable4.draw(c10);
                                }
                                Drawable drawable5 = this.f15409f;
                                if (drawable5 != null) {
                                    drawable5.setAlpha(255);
                                    return;
                                }
                                return;
                            }
                            Intrinsics.k("mView");
                            throw null;
                        }
                        Intrinsics.k("mView");
                        throw null;
                    }
                    Intrinsics.k("mView");
                    throw null;
                }
                Intrinsics.k("mView");
                throw null;
            }
            return;
        }
        Intrinsics.k("mView");
        throw null;
    }

    public final int g(int i10) {
        float f10 = i10;
        Context context = this.f15407d;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f15417n == 1.0f) {
            try {
                this.f15417n = context.getResources().getDisplayMetrics().density;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (f10 == g.f34069a) {
            return 0;
        }
        return (int) Math.ceil(this.f15417n * f10);
    }
}
