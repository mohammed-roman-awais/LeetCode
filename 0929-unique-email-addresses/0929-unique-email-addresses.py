class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        unique = set()

        for email in emails:
            local, domain = email.split('@')

            # Ignore everything after '+'
            if '+' in local:
                local = local[:local.index('+')]

            # Remove all dots
            local = local.replace('.', '')

            # Create final email
            unique.add(local + '@' + domain)

        return len(unique)