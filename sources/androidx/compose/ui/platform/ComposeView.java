package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import d2.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import t0.n;
import t0.n1;
import t0.o3;
import t0.r;
import t0.t;
import t0.x1;
import w.p0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Ld2/a;", HttpUrl.FRAGMENT_ENCODE_SET, "getAccessibilityClassName", "Lkotlin/Function0;", HttpUrl.FRAGMENT_ENCODE_SET, "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", HttpUrl.FRAGMENT_ENCODE_SET, "<set-?>", "j", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ComposeView extends a {

    /* renamed from: i, reason: collision with root package name */
    public final n1 f1434i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // d2.a
    public final void a(n nVar, int i10) {
        int i11;
        int i12;
        r rVar = (r) nVar;
        rVar.c0(420213850);
        if ((i10 & 6) == 0) {
            if (rVar.j(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            Function2 function2 = (Function2) this.f1434i.getValue();
            if (function2 != null) {
                function2.invoke(rVar, 0);
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0(i10, 10, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // d2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(@NotNull Function2<? super n, ? super Integer, Unit> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.f1434i.setValue(content);
        if (isAttachedToWindow()) {
            if (this.f13295d == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
            }
            d();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, (i10 & 2) != 0 ? null : attributeSet, 0);
        this.f1434i = t.n0(null, o3.f35116a);
    }
}
