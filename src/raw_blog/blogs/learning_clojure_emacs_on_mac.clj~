{:title "Learning Clojure & Emacs on Mac"
 :desc "My experience building this blog website using the Clojure programming language, Emacs as my editor of choice all while using a Macbook iOS."
 :keywords "clojure, emacs, blog, web development, programming, mac, ios"
 :author "Anton Wieslander"
 :date ""
 :content [:div.post 
           [:h2 "Learning Clojure & Emacs on Mac"]
           [:div.post-content 
            [:h3.post-heading "Introduction"]
            [:p "Much like smoking weed some people get the impression that they might be missing out on a great big secret if they don't smoke it. That's the way I felt towards people who use emacs/vim, develop on Mac, go to developer conventions and cover their laptops in stickers."]
            [:p "So during my Christmas holidays I've decided I am going to build a blog web app using Clojure, Emacs on a Mac, and see if I can uncover any secret knowledge. Bear in mind: I develop on Windows using languages like csharp, js, python, java and tend to heavily lean on IntelliJ IDE support."]
            [:p "Prior to doing this I already have minor Clojure experience and unfortunatley will not be able to re-live the original `it's just data` realization. Previously I've used VS Code + Cider extension + WSL and never got to ship anything to production, so my experience is purely academic."]
            [:p "Butterfly keyboard underneath my fingers, Control bound to CapsLock, Command swapped with Option and a touch screen replacing my F keys I go..."]
            [:h5.post-heading "The Emacs ice bath"]
            [:p "To be able to hard code this blog in to my Clojure code while using Emacs I had to set it all up and learn how Emacs works. The setup for both Clojure and Emacs is pretty straightforward following the instruction in the free e-book \"Clojure for the Brave and True\". Learning how to use Emacs after years of using modern IDE's, is a different story."]
            [:p "Same as when you try Clojure and the inability to assign feels like a missing limb, with Emacs the feeling is closer to missing all your limbs and reduced intelegence. After 2 days practice, here I am a self certified Emacs nursery graduate and already formed my 1st aggregate of opinions and my best friends are C-g and his brother C-/."]
            [:ul 
             [:li "I understand you can extend/customise Emacs to your hearts content by writing some LISP which I think is amaizing, although at this point it's still too overwhelming to even attempt."]
             [:li "The keybinds make sense after a while, and no longer feels like you need 300IQ to operate Emacs. Although alot of commands require at least 2 combinations which start with C-.. or M-.. for examle I would have to press Ctrl-C Ctrl-S to save a file where before it would be just Ctrl-S. Not a big fan of these and I feel like they give me the 'I am doing alot of work' illusion."]
             [:li "My biggest bother are the files and that I can't see them. That's right there's no 'Solution Explorer'. I need to remember the names of all my files and where they are located. Press C-x C-f, start in the directory of the currently focused buffer and navigate to your destination file command line style. This is waaaay off IntelliJ's Shift+Shift Search Everywhere feature. As I see it Emacs does not 'open a project folder', it's an explorer with powerful text processing."]
             [:li "You can bring up a list of open buffers with C-x C-b, which makes switching between recently opened files easier. (still not as good as Search Everywhere)"]
             [:li "Shell is accessible in a buffer as well with: M-x shell. It's not perfect but good to have."]
             [:li "Text selection/manipulation seems to be inferior to that of Rider or even VS Code. Alot of useful commands are missing and you have to ether do Emacs gymnastics or extend it. Currently missing my Expand Selection, Select Next Occurance and Duplicate Line (Emacs - C-a C-spc C-n M-w C-y; IntelliJ - C-d)"]
             [:li "The experiance is very serene, it's just you and the code. This has been a very enjoyable experiance."]]
            [:p "As you can see it's a bit daunting to get started with Emacs but it's possible. Also just to make things clear, I am aware I just scratched the surface and have yet to see Emacs for what it is."]
            ]]}



;; (defn layout [render-ctx]
;;   (let [{title :title
;;          css :css
;;          content :content} render-ctx]
;;     (html [:head 
;;            [:title title]
;;            [:style css]]
;;           [:body 
;;            [:body content]])))

;; (defn handler [request]
;;   {:status 200
;;    :headers {"Content-Type" "text/html"}
;;    :body (layout {:title "Test Header"
;;                   :css ".foo {color:red;}"
;;                   :content [:div.foo "Hello World"]})})
