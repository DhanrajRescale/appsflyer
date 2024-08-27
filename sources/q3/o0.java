package q3;

import android.app.Notification;
import android.app.Person;

/* loaded from: classes.dex */
public abstract class o0 {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
        return builder.setSemanticAction(i10);
    }
}
