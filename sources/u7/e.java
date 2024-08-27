package u7;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36907a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36908b;

    public e(ko.a aVar) {
        this.f36908b = aVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        switch (this.f36907a) {
            case 0:
                return ((Drawable.ConstantState) this.f36908b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f36907a) {
            case 0:
                return ((Drawable.ConstantState) this.f36908b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i10 = this.f36907a;
        Object obj = this.f36908b;
        switch (i10) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                fVar.f36914a = newDrawable;
                newDrawable.setCallback(fVar.f36913f);
                return fVar;
            default:
                return (ko.a) obj;
        }
    }

    public /* synthetic */ e(ko.a aVar, int i10) {
        this(aVar);
    }

    public e(Drawable.ConstantState constantState) {
        this.f36908b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f36907a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f36908b).newDrawable(resources);
                fVar.f36914a = newDrawable;
                newDrawable.setCallback(fVar.f36913f);
                return fVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f36907a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f36908b).newDrawable(resources, theme);
                fVar.f36914a = newDrawable;
                newDrawable.setCallback(fVar.f36913f);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
