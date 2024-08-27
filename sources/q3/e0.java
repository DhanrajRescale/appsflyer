package q3;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class e0 {
    public static Notification.InboxStyle a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
        return inboxStyle.addLine(charSequence);
    }

    public static Notification.InboxStyle b(Notification.Builder builder) {
        return new Notification.InboxStyle(builder);
    }

    public static Notification.InboxStyle c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
        return inboxStyle.setBigContentTitle(charSequence);
    }

    public static Notification.InboxStyle d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
        return inboxStyle.setSummaryText(charSequence);
    }
}
